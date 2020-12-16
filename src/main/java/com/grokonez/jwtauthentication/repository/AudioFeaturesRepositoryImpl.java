package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.AudioFeatures;
import com.grokonez.jwtauthentication.model.Playlist;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Map;

public class AudioFeaturesRepositoryImpl implements  AudioFeaturesRepository{
    private RedisTemplate<Long, AudioFeatures> redisTemplate;

    private HashOperations hashOperations;

    public AudioFeaturesRepositoryImpl(RedisTemplate<Long, AudioFeatures> redisTemplate) {
        this.redisTemplate = redisTemplate;
        hashOperations = redisTemplate.opsForHash();
    }
    @Override
    public void save(AudioFeatures audioFeatures) {

        hashOperations.put("USER",audioFeatures.getId(),audioFeatures);
    }
    @Override
    public Map<Long, AudioFeatures> findAll() {

        return hashOperations.entries("AUDIOFEATURES");
    }
    @Override
    public AudioFeatures findById(Long id) {
        return (AudioFeatures)hashOperations.get("AUDIOFEATURES",id);
    }
    @Override
    public Boolean delete(Long id){
        hashOperations.delete("AUDIOFEATURES",id);
        return true;
    }
}
