package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.Artist;

import java.util.Map;

public interface ArtistRepository {
    void save(Artist playlist);
    Map<Long, Artist> findAll();
    Artist findById(Long id);
    Boolean delete(Long id);

}
