package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.AudioFeatures;
import com.grokonez.jwtauthentication.model.Track;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;
@Repository

public class TrackRepositoryImpl implements TrackRepository {
	private final RedisTemplate<String, Track> redisTemplate;
	private final HashOperations hashOperations;
	public TrackRepositoryImpl(RedisTemplate<String, Track> redisTemplate) {
		this.redisTemplate = redisTemplate;
		hashOperations = redisTemplate.opsForHash();
	}

	@Override
	public void save(Track track) {
		hashOperations.put("TRACKS", track.getId(), track);
	}

	@Override
	public Map<String, Track> findAll() {
		return hashOperations.entries("TRACKS");
	}

	@Override
	public Track findById(String uri_track) {
		return (Track) hashOperations.get("TRACKS", uri_track);
	}

	@Override
	public Boolean delete(String uri_track) {
		hashOperations.delete("TRACKS", uri_track);
		return true;
	}
}
