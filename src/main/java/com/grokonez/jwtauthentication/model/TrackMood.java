package com.grokonez.jwtauthentication.model;

import java.io.Serializable;

public class TrackMood implements Serializable {
	private String id;
	private String mood;

	public TrackMood() {
	}

	public TrackMood(String id, String mood) {
		this.id = id;
		this.mood = mood;
	}

	/**
	 * get field
	 *
	 * @return id
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * set field
	 *
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * get field
	 *
	 * @return mood
	 */
	public String getMood() {
		return this.mood;
	}

	/**
	 * set field
	 *
	 * @param mood
	 */
	public void setMood(String mood) {
		this.mood = mood;
	}
}
