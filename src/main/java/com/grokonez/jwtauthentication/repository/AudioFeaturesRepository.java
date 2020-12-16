package com.grokonez.jwtauthentication.repository;


import com.grokonez.jwtauthentication.model.AudioFeatures;

import java.util.Map;

public interface AudioFeaturesRepository {
    void save(AudioFeatures playlist);

    Map<Long, AudioFeatures> findAll();

    AudioFeatures findById(Long id);

    Boolean delete(Long id);

}
