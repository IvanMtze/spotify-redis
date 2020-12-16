package com.grokonez.jwtauthentication.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
@Entity
@Table(name = "track")
public class Track implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Size(min=1, max = 100)
    String album;

    @ElementCollection
    ArrayList<Artist> artists;

    @ElementCollection
    ArrayList<String> available_markets;

    Integer disc_number;

    Integer duration_ms;

    @Size(min=1, max = 100)
    Boolean explicit;

    @ElementCollection
    ArrayList<String> external_ids;

    @ElementCollection
    ArrayList<String> external_urls;

    @Size(min=1, max = 100)
    String href;

    @Size(min=1, max = 100)
    String id_internal;

    Boolean is_playable;

    @Size(min=1, max = 100)
    String name;

    @Size(min=1, max = 100)
    String preview_url;

    Integer track_number;

    @Size(min=1, max = 100)
    String type;

    @Size(min=1, max = 100)
    String uri;

    Boolean is_local;

    public Track() {
    }

    public Track(Long id, String album, ArrayList<Artist> artists, ArrayList<String> available_markets,
                 Integer disc_number,Integer duration_ms, Boolean explicit, ArrayList<String> external_ids,
                 ArrayList<String> external_urls, String href, String id_internal, Boolean is_playable, String name,
                 String preview_url, Integer track_number, String type, String uri, Boolean is_local) {
        this.id = id;
        this.album = album;
        this.artists = artists;
        this.available_markets = available_markets;
        this.disc_number = disc_number;
        this.duration_ms = duration_ms;
        this.explicit = explicit;
        this.external_ids = external_ids;
        this.external_urls = external_urls;
        this.href = href;
        this.id_internal = id_internal;
        this.is_playable = is_playable;
        this.name = name;
        this.preview_url = preview_url;
        this.track_number = track_number;
        this.type = type;
        this.uri = uri;
        this.is_local = is_local;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
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

    public Integer getDisc_number() {
        return disc_number;
    }

    public void setDisc_number(Integer disc_number) {
        this.disc_number = disc_number;
    }

    public Integer getDuration_ms() {
        return duration_ms;
    }

    public void setDuration_ms(Integer duration_ms) {
        this.duration_ms = duration_ms;
    }

    public Boolean getExplicit() {
        return explicit;
    }

    public void setExplicit(Boolean explicit) {
        this.explicit = explicit;
    }

    public ArrayList<String> getExternal_ids() {
        return external_ids;
    }

    public void setExternal_ids(ArrayList<String> external_ids) {
        this.external_ids = external_ids;
    }

    public ArrayList<String> getExternal_urls() {
        return external_urls;
    }

    public void setExternal_urls(ArrayList<String> external_urls) {
        this.external_urls = external_urls;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getId_internal() {
        return id_internal;
    }

    public void setId_internal(String id_internal) {
        this.id_internal = id_internal;
    }

    public Boolean getIs_playable() {
        return is_playable;
    }

    public void setIs_playable(Boolean is_playable) {
        this.is_playable = is_playable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreview_url() {
        return preview_url;
    }

    public void setPreview_url(String preview_url) {
        this.preview_url = preview_url;
    }

    public Integer getTrack_number() {
        return track_number;
    }

    public void setTrack_number(Integer track_number) {
        this.track_number = track_number;
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

    public Boolean getIs_local() {
        return is_local;
    }

    public void setIs_local(Boolean is_local) {
        this.is_local = is_local;
    }
}
