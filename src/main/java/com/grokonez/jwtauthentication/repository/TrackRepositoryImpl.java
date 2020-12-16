package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.Playlist;
import com.grokonez.jwtauthentication.model.Track;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Map;

public class TrackRepositoryImpl implements TrackRepository{
    private RedisTemplate<Long, Track> redisTemplate;

    private HashOperations hashOperations;

    public TrackRepositoryImpl(RedisTemplate<Long, Track> redisTemplate) {
        this.redisTemplate = redisTemplate;
        hashOperations = redisTemplate.opsForHash();
    }
    @Override
    public void save(Track track) {

        hashOperations.put("USER",track.getId(),track);
    }
    @Override
    public Map<Long, Track> findAll() {

        return hashOperations.entries("TRACK");
    }
    @Override
    public Track findById(Long id) {
        return (Track)hashOperations.get("TRACK",id);
    }
    @Override
    public Boolean delete(Long id){
        hashOperations.delete("TRACK",id);
        return true;
    }
}
