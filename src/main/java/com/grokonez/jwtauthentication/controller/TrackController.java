package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.model.AudioFeatures;
import com.grokonez.jwtauthentication.model.Track;
import com.grokonez.jwtauthentication.repository.AudioFeaturesRepository;
import com.grokonez.jwtauthentication.repository.TrackRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@Api(tags = "track")
@RequestMapping("/api/track")
public class TrackController {

    @Autowired
    private final TrackRepository trackRepository;

    public TrackController(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @GetMapping("/")
    @ApiOperation(value = "Count the number of entities associated with resource name. This operation does not requires any role.", authorizations = {@Authorization(value = "apikey")})
    public Map<String, Track> GetAll() {
        return trackRepository.findAll();
    }

    @PostMapping("/")
    @ApiOperation(value = "Count the number of entities associated with resource name. This operation does not requires any role.", authorizations = {@Authorization(value = "apikey")})
    public Track add(@RequestBody Track track) {
        trackRepository.save(track);
        return trackRepository.findById(track.getId());
    }

    @DeleteMapping("/{uri_track}")
    @ApiOperation(value = "Count the number of entities associated with resource name. This operation does not requires any role.", authorizations = {@Authorization(value = "apikey")})
    public Boolean delete(@PathVariable String uri_track) {
        return trackRepository.delete(uri_track);
    }

    @GetMapping("/{uri_track}")
    @ApiOperation(value = "Count the number of entities associated with resource name. This operation does not requires any role.", authorizations = {@Authorization(value = "apikey")})
    public Track getById(@PathVariable String uri_track) {
        return trackRepository.findById(uri_track);
    }

}