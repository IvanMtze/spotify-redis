package com.grokonez.jwtauthentication.controller;

import java.util.Map;

import com.grokonez.jwtauthentication.model.Album;
import com.grokonez.jwtauthentication.model.Playlist;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;

import com.grokonez.jwtauthentication.repository.PlaylistRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@Api( tags = "playlist")
@RequestMapping("/api/playlist")
public class PlaylistController {

    @Autowired
    private PlaylistRepository playlistRepository;

     public PlaylistController(PlaylistRepository playlistRepository){
         playlistRepository = playlistRepository;
     }

    @GetMapping("/")
    @ApiOperation(value = "Count the number of entities associated with resource name. This operation does not requires any role." , authorizations={@Authorization(value = "apikey")})
    public Map<Long, Playlist> GetAll(){
        return playlistRepository.findAll();
    }
    @PostMapping("/")
    @ApiOperation(value = "Count the number of entities associated with resource name. This operation does not requires any role." , authorizations={@Authorization(value = "apikey")})
    public Playlist add(@RequestBody Playlist playlist){
        playlistRepository.save(new Playlist(playlist.getId(),playlist.getPlaylist(),playlist.getPais(),playlist.getDiaCreado(),playlist.getPopularidad()));
        return playlistRepository.findById(playlist.getId());
    }
    @DeleteMapping("/{id}")
    @ApiOperation(value = "Count the number of entities associated with resource name. This operation does not requires any role." , authorizations={@Authorization(value = "apikey")})
    public Boolean delete(@PathVariable Long id){
        return playlistRepository.delete(id);
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Count the number of entities associated with resource name. This operation does not requires any role." , authorizations={@Authorization(value = "apikey")})
    public Playlist getById(@PathVariable Long id){
        return playlistRepository.findById(id);
    }


}
