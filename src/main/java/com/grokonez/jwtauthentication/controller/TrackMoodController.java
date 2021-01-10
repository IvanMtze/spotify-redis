package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.model.Track;
import com.grokonez.jwtauthentication.model.TrackMood;
import com.grokonez.jwtauthentication.repository.TrackMoodRepository;
import com.grokonez.jwtauthentication.repository.TrackRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@Api(tags = "trackmood")
@RequestMapping("/api/trackmood")
public class TrackMoodController {
	@Autowired
	private final TrackMoodRepository trackMoodRepository;

	public TrackMoodController(TrackMoodRepository trackMoodRepository) {
		this.trackMoodRepository = trackMoodRepository;
	}

	@GetMapping("/")
	@ApiOperation(value = "Count the number of entities associated with resource name. This operation does not requires any role.", authorizations = {@Authorization(value = "apikey")})
	public Map<String, TrackMood> GetAll() {
		return trackMoodRepository.findAll();
	}

	@PostMapping("/")
	@ApiOperation(value = "Count the number of entities associated with resource name. This operation does not requires any role.", authorizations = {@Authorization(value = "apikey")})
	public TrackMood add(@RequestBody TrackMood track) {
		trackMoodRepository.save(track);
		return trackMoodRepository.findById(track.getId());
	}

	@DeleteMapping("/{uri_track}")
	@ApiOperation(value = "Count the number of entities associated with resource name. This operation does not requires any role.", authorizations = {@Authorization(value = "apikey")})
	public Boolean delete(@PathVariable String uri_track) {
		return trackMoodRepository.delete(uri_track);
	}

	@GetMapping("/{uri_track}")
	@ApiOperation(value = "Count the number of entities associated with resource name. This operation does not requires any role.", authorizations = {@Authorization(value = "apikey")})
	public TrackMood getById(@PathVariable String uri_track) {
		return trackMoodRepository.findById(uri_track);
	}
}
