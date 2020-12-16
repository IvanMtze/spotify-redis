package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.Playlist;

import java.util.Map;

public interface PlaylistRepository {
    void save(Playlist playlist);

    Map<Long, Playlist> findAll();

    Playlist findById(Long id);

    Boolean delete(Long id);

}
