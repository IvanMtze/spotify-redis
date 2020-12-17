package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.model.Artist;
import com.grokonez.jwtauthentication.repository.ArtistRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@Api(tags = "artist")
@RequestMapping("/api/artist")
public class ArtistController {


    @Autowired
    private final ArtistRepository artistRepository;

    public ArtistController(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @GetMapping("/")
    @ApiOperation(value = "Count the number of entities associated with resource name. This operation does not requires any role.", authorizations = {@Authorization(value = "apikey")})
    public Map<Long, Artist> GetAll() {
        return artistRepository.findAll();
    }

    @PostMapping("/")
    public Artist add(@RequestBody Artist artist) {
        artistRepository.save(artist);
        return artistRepository.findById(artist.getId());
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Count the number of entities associated with resource name. This operation does not requires any role.", authorizations = {@Authorization(value = "apikey")})
    public Boolean delete(@PathVariable Long id) {
        return artistRepository.delete(id);
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Count the number of entities associated with resource name. This operation does not requires any role.", authorizations = {@Authorization(value = "apikey")})
    public Artist getById(@RequestBody Long id) {
        return artistRepository.findById(id);
    }

}