package com.grokonez.jwtauthentication.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "artist")
public class Artist implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Size(min = 1, max = 100)
    String external_urls;

    @Size(min = 1, max = 100)
    String followers;

    @ElementCollection(targetClass = String.class)
    List<String> genres;

    @Size(min = 1, max = 100)
    String href;

    @Size(min = 1, max = 100)
    String name;

    @ManyToMany(mappedBy = "artists")
    List<Album> albums;

    Integer popularity;

    @Size(min = 1, max = 100)
    String type;

    @Size(min = 1, max = 100)
    String uri;

    public Artist() {
    }

    public Artist(
            String external_urls,
            List<Album> albums,
            String followers,
            List<String> genres,
            String href,
            String name,
            Integer popularity,
            String type,
            String uri
    ) {
        this.external_urls = external_urls;
        this.followers = followers;
        this.genres = genres;
        this.href = href;
        this.name = name;
        this.popularity = popularity;
        this.type = type;
        this.albums = albums;
        this.uri = uri;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public String getExternal_urls() {
        return external_urls;
    }

    public void setExternal_urls(String external_urls) {
        this.external_urls = external_urls;
    }

    public String getFollowers() {
        return followers;
    }

    public void setFollowers(String followers) {
        this.followers = followers;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
