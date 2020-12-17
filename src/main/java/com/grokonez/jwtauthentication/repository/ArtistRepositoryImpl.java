package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.Artist;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class ArtistRepositoryImpl implements ArtistRepository {
    private final RedisTemplate<Long, Artist> redisTemplate;

    private final HashOperations hashOperations;

    public ArtistRepositoryImpl(RedisTemplate<Long, Artist> redisTemplate) {
        this.redisTemplate = redisTemplate;
        hashOperations = redisTemplate.opsForHash();
    }

    @Override
    public void save(Artist artist) {

        hashOperations.put("USER", artist.getId(), artist);
    }

    @Override
    public Map<Long, Artist> findAll() {

        return hashOperations.entries("ARTIST");
    }

    @Override
    public Artist findById(Long id) {
        return (Artist) hashOperations.get("ARTIST", id);
    }

    @Override
    public Boolean delete(Long id) {
        hashOperations.delete("ARTIST", id);
        return true;
    }
}
