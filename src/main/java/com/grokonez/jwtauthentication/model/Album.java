package com.grokonez.jwtauthentication.model;

import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
@Table(name="album")
public class Album implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Size(min=1, max=100)
    String album_type;

    @ElementCollection
    @CollectionTable(name="artists")
    ArrayList<Artist> artists;

    ArrayList<String> available_markets;

    ArrayList<String> copyrights;

    @Size(min=1, max=100)
    String external_ids;

    @Size(min=1, max=100)
    String external_urls;

    ArrayList<String> genres;

    @Size(min=1, max=100)
    String href;

    @Size(min=1, max=100)
    String id_spotify;

    @Size(min=1, max=100)
    String label;

    @Size(min=1, max=100)
    String name;

    Integer popularity;

    @Size(min=1, max=100)
    String release_date;

    @Size(min=1, max=100)
    String release_date_precision;

    @ElementCollection
    ArrayList<String> tracks;

    @Size(min=1, max=100)
    String type;

    @Size(min=1, max=100)
    String uri;

    public Album() {
    }

    public Album(Long id, String album_type, ArrayList<Artist> artists, ArrayList<String> available_markets, ArrayList<String> copyrights, String external_ids, String external_urls, ArrayList<String> genres,String href, String id_spotify, String label, String name, Integer popularity, String release_date, String release_date_precision, ArrayList<String> tracks, String type, String uri) {
        this.id = id;
        this.album_type = album_type;
        this.artists = artists;
        this.available_markets = available_markets;
        this.copyrights = copyrights;
        this.external_ids = external_ids;
        this.external_urls = external_urls;
        this.genres = genres;
        this.href = href;
        this.id_spotify = id_spotify;
        this.label = label;
        this.name = name;
        this.popularity = popularity;
        this.release_date = release_date;
        this.release_date_precision = release_date_precision;
        this.tracks = tracks;
        this.type = type;
        this.uri = uri;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlbum_type() {
        return album_type;
    }

    public void setAlbum_type(String album_type) {
        this.album_type = album_type;
    }

    public ArrayList<Artist> getArtists() {
        return artists;
    }

    public void setArtists(ArrayList<Artist> artists) {
        this.artists = artists;
    }

    public ArrayList<String> getAvailable_markets() {
        return available_markets;
    }

    public void setAvailable_markets(ArrayList<String> available_markets) {
        this.available_markets = available_markets;
    }

    public ArrayList<String> getCopyrights() {
        return copyrights;
    }

    public void setCopyrights(ArrayList<String> copyrights) {
        this.copyrights = copyrights;
    }

    public String getExternal_ids() {
        return external_ids;
    }

    public void setExternal_ids(String external_ids) {
        this.external_ids = external_ids;
    }

    public String getExternal_urls() {
        return external_urls;
    }

    public void setExternal_urls(String external_urls) {
        this.external_urls = external_urls;
    }

    public ArrayList<String> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<String> genres) {
        this.genres = genres;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getId_spotify() {
        return id_spotify;
    }

    public void setId_spotify(String id_spotify) {
        this.id_spotify = id_spotify;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getRelease_date_precision() {
        return release_date_precision;
    }

    public void setRelease_date_precision(String release_date_precision) {
        this.release_date_precision = release_date_precision;
    }

    public ArrayList<String> getTracks() {
        return tracks;
    }

    public void setTracks(ArrayList<String> tracks) {
        this.tracks = tracks;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
