package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.model.Album;
import com.grokonez.jwtauthentication.repository.AlbumRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@Api( tags = "album")
@RequestMapping("/api/album")
public class AlbumController {

    @Autowired
    private AlbumRepository albumRepository;

    public AlbumController(AlbumRepository playlistRepository){
        albumRepository = playlistRepository;
    }

    @GetMapping("/")
    @ApiOperation(value = "Count the number of entities associated with resource name. This operation does not requires any role." , authorizations={@Authorization(value = "apikey")})
    public Map<Long, Album> GetAll(){
        return albumRepository.findAll();
    }

    @PostMapping("/")
    @ApiOperation(value = "Count the number of entities associated with resource name. This operation does not requires any role." , authorizations={@Authorization(value = "apikey")})
    public Album add(@RequestBody Album playlist){
        albumRepository.save(playlist);
        return albumRepository.findById(playlist.getId());
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Count the number of entities associated with resource name. This operation does not requires any role." , authorizations={@Authorization(value = "apikey")})
    public Album getById(@PathVariable  Long id){
        return albumRepository.findById(id);
    }

    @DeleteMapping("/")
    @ApiOperation(value = "Count the number of entities associated with resource name. This operation does not requires any role." , authorizations={@Authorization(value = "apikey")})
    public Boolean delete(@RequestBody Long id){
        return albumRepository.delete(id);
    }
}