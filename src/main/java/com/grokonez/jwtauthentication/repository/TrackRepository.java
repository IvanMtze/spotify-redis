package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.Track;

import java.util.Map;

public interface TrackRepository {
	void save(Track track);
	Map<String, Track> findAll();
	Track findById(String uri_track);
	Boolean delete(String uri_track);
}
