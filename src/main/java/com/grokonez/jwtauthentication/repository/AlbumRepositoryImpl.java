package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.Album;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class AlbumRepositoryImpl implements AlbumRepository {
    private final RedisTemplate<Long, Album> redisTemplate;

    private final HashOperations hashOperations;

    public AlbumRepositoryImpl(RedisTemplate<Long, Album> redisTemplate) {
        this.redisTemplate = redisTemplate;
        hashOperations = redisTemplate.opsForHash();
    }

    @Override
    public void save(Album album) {
        hashOperations.put("USER", album.getId(), album);
    }

    @Override
    public Map<Long, Album> findAll() {
        return hashOperations.entries("ALBUM");
    }

    @Override
    public Album findById(Long id) {
        return (Album) hashOperations.get("ALBUM", id);
    }

    @Override
    public Boolean delete(Long id) {
        hashOperations.delete("ALBUM", id);
        return true;
    }
}
