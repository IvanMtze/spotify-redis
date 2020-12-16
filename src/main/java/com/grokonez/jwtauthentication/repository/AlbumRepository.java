package com.grokonez.jwtauthentication.repository;


import com.grokonez.jwtauthentication.model.Album;

import java.util.Map;

public interface AlbumRepository {

    void save(Album playlist);

    Map<Long, Album> findAll();

    Album findById(Long id);

    Boolean delete(Long id);
}
