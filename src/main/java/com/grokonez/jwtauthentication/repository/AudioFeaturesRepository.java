package com.grokonez.jwtauthentication.repository;


import com.grokonez.jwtauthentication.model.AudioFeatures;

import java.util.Map;

public interface AudioFeaturesRepository {
    void save(AudioFeatures audioFeatures);
    Map<String, AudioFeatures> findAll();
    AudioFeatures findById(String uri_track);
    Boolean delete(String uri_track);
}
