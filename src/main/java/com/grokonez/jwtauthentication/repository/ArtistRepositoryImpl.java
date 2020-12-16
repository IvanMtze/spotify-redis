package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.Artist;
import com.grokonez.jwtauthentication.model.Playlist;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Map;

public class ArtistRepositoryImpl implements ArtistRepository{
    private RedisTemplate<Long, Artist> redisTemplate;

    private HashOperations hashOperations;

    public ArtistRepositoryImpl(RedisTemplate<Long, Artist> redisTemplate) {
        this.redisTemplate = redisTemplate;
        hashOperations = redisTemplate.opsForHash();
    }
    @Override
    public void save(Artist artist) {

        hashOperations.put("USER",artist.getId(),artist);
    }
    @Override
    public Map<Long, Artist> findAll() {

        return hashOperations.entries("ARTIST");
    }
    @Override
    public Artist findById(Long id) {
        return (Artist)hashOperations.get("ARTIST",id);
    }

    @Override
    public Boolean delete(Long id){
        hashOperations.delete("ARTIST",id);
        return true;
    }
}
