package com.grokonez.jwtauthentication.model;

import java.io.Serializable;
import java.util.Date;

public class Track implements Serializable {
	private String name;
	private String album_name;
	private String album_artists_name;
	private String release_date;
	private Float duration_ms;
	private Float popularity;
	private String id;

	public Track() {
	}

	public Track(String name, String album_name, String album_artists_name, String release_date, Float duration_ms, Float popularity, String id) {
		this.name = name;
		this.album_name = album_name;
		this.album_artists_name = album_artists_name;
		this.release_date = release_date;
		this.duration_ms = duration_ms;
		this.popularity = popularity;
		this.id = id;
	}

	/**
	 * get field
	 *
	 * @return name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * set field
	 *
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * get field
	 *
	 * @return album_name
	 */
	public String getAlbum_name() {
		return this.album_name;
	}

	/**
	 * set field
	 *
	 * @param album_name
	 */
	public void setAlbum_name(String album_name) {
		this.album_name = album_name;
	}

	/**
	 * get field
	 *
	 * @return album_artists_name
	 */
	public String getAlbum_artists_name() {
		return this.album_artists_name;
	}

	/**
	 * set field
	 *
	 * @param album_artists_name
	 */
	public void setAlbum_artists_name(String album_artists_name) {
		this.album_artists_name = album_artists_name;
	}

	/**
	 * get field
	 *
	 * @return release_date
	 */
	public String getRelease_date() {
		return this.release_date;
	}

	/**
	 * set field
	 *
	 * @param release_date
	 */
	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	/**
	 * get field
	 *
	 * @return duration_ms
	 */
	public Float getDuration_ms() {
		return this.duration_ms;
	}

	/**
	 * set field
	 *
	 * @param duration_ms
	 */
	public void setDuration_ms(Float duration_ms) {
		this.duration_ms = duration_ms;
	}

	/**
	 * get field
	 *
	 * @return popularity
	 */
	public Float getPopularity() {
		return this.popularity;
	}

	/**
	 * set field
	 *
	 * @param popularity
	 */
	public void setPopularity(Float popularity) {
		this.popularity = popularity;
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
}
