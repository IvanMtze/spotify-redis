package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.model.AudioFeatures;
import com.grokonez.jwtauthentication.repository.AudioFeaturesRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@Api(tags = "audiofeatures")
@RequestMapping("/api/audiofeatures")
public class AudioFeaturesController {

    @Autowired
    private final AudioFeaturesRepository audioFeaturesRepository;

    public AudioFeaturesController(AudioFeaturesRepository audioFeaturesRepository) {
        this.audioFeaturesRepository = audioFeaturesRepository;
    }

    @GetMapping("/")
    @ApiOperation(value = "Count the number of entities associated with resource name. This operation does not requires any role.", authorizations = {@Authorization(value = "apikey")})
    public Map<Long, AudioFeatures> GetAll() {
        return audioFeaturesRepository.findAll();
    }

    @PostMapping("/")
    @ApiOperation(value = "Count the number of entities associated with resource name. This operation does not requires any role.", authorizations = {@Authorization(value = "apikey")})
    public AudioFeatures add(@RequestBody AudioFeatures audioFeatures) {
        audioFeaturesRepository.save(audioFeatures);
        return audioFeaturesRepository.findById(audioFeatures.getId());
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Count the number of entities associated with resource name. This operation does not requires any role.", authorizations = {@Authorization(value = "apikey")})
    public Boolean delete(@PathVariable Long id) {
        return audioFeaturesRepository.delete(id);
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Count the number of entities associated with resource name. This operation does not requires any role.", authorizations = {@Authorization(value = "apikey")})
    public AudioFeatures getById(@PathVariable Long id) {
        return audioFeaturesRepository.findById(id);
    }

}