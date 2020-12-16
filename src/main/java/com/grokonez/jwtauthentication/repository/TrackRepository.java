package com.grokonez.jwtauthentication.repository;


import com.grokonez.jwtauthentication.model.Track;

import java.util.Map;

public interface TrackRepository {
    void save(Track playlist);
    Map<Long, Track> findAll();
    Track findById(Long id);
    Boolean delete(Long id);

}
