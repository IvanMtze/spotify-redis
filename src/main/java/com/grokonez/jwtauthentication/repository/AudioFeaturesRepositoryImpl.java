package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.AudioFeatures;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class AudioFeaturesRepositoryImpl implements AudioFeaturesRepository {
    private final RedisTemplate<String, AudioFeatures> redisTemplate;

    private final HashOperations hashOperations;

    public AudioFeaturesRepositoryImpl(RedisTemplate<String, AudioFeatures> redisTemplate) {
        this.redisTemplate = redisTemplate;
        hashOperations = redisTemplate.opsForHash();
    }

    @Override
    public void save(AudioFeatures audioFeatures) {

        hashOperations.put("AUDIOFEATURES", audioFeatures.getUri_song(), audioFeatures);
    }

    @Override
    public Map<String, AudioFeatures> findAll() {

        return hashOperations.entries("AUDIOFEATURES");
    }

    @Override
    public AudioFeatures findById(String uri_track) {
        return (AudioFeatures) hashOperations.get("AUDIOFEATURES", uri_track);
    }

    @Override
    public Boolean delete(String uri_track) {
        hashOperations.delete("AUDIOFEATURES", uri_track);
        return true;
    }
}
