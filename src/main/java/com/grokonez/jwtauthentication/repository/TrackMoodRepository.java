package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.TrackMood;

import java.util.Map;

public interface TrackMoodRepository {
	void save(TrackMood track);
	Map<String, TrackMood> findAll();
	TrackMood findById(String uri_track);
	Boolean delete(String uri_track);
}
