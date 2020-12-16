package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.Playlist;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;


@Repository
public class PlaylistRepositoryImpl implements PlaylistRepository {

    private final RedisTemplate<Long, Playlist> redisTemplate;

    private final HashOperations hashOperations;

    public PlaylistRepositoryImpl(RedisTemplate<Long, Playlist> redisTemplate) {
        this.redisTemplate = redisTemplate;
        hashOperations = redisTemplate.opsForHash();
    }

    @Override
    public void save(Playlist playlist) {

        hashOperations.put("USER", playlist.getId(), playlist);
    }

    @Override
    public Map<Long, Playlist> findAll() {

        return hashOperations.entries("PLAYLIST");
    }

    @Override
    public Playlist findById(Long id) {
        return (Playlist) hashOperations.get("PLAYLIST", id);
    }

    @Override
    public Boolean delete(Long id) {
        hashOperations.delete("PLAYLIST", id);
        return true;
    }
}
