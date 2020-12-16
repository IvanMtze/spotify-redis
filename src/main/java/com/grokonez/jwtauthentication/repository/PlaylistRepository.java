package com.grokonez.jwtauthentication.repository;

import java.util.Map;

import com.grokonez.jwtauthentication.model.Playlist;

public interface PlaylistRepository {
    void save(Playlist playlist);
    Map<Long, Playlist> findAll();
    Playlist findById(Long id);
    Boolean delete(Long id);

}
