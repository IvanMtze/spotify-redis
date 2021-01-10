package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.Track;
import com.grokonez.jwtauthentication.model.TrackMood;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;
@Repository

public class TrackMoodRepositoryImpl implements TrackMoodRepository{
	private final RedisTemplate<String, TrackMood> redisTemplate;
	private final HashOperations hashOperations;
	public TrackMoodRepositoryImpl(RedisTemplate<String, TrackMood> redisTemplate) {
		this.redisTemplate = redisTemplate;
		hashOperations = redisTemplate.opsForHash();
	}
	@Override
	public void save(TrackMood track) {
		hashOperations.put("TRACKMOODS", track.getId(), track);

	}

	@Override
	public Map<String, TrackMood> findAll() {
		return hashOperations.entries("TRACKMOODS");
	}

	@Override
	public TrackMood findById(String uri_track) {
		return (TrackMood) hashOperations.get("TRACKMOODS", uri_track);
	}

	@Override
	public Boolean delete(String uri_track) {
		hashOperations.delete("TRACKMOODS", uri_track);
		return true;
	}
}
