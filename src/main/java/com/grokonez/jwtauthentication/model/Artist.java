package com.grokonez.jwtauthentication.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Size;


@Entity
@Table(name="artist")
public class Artist implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    
    @Size(min=1, max=100)
    String external_urls;

    @Size(min=1, max=100)
    String followers;

    @ElementCollection
    ArrayList<String> genres;

    @Size(min=1, max=100)
    String href;

    @Size(min=1, max=100)
    String name;

    Integer popularity;
    
    @Size(min=1, max=100)
    String type;

    @Size(min=1, max=100)
    String uri;

    public Artist(){}
    public Artist(
        String external_urls,
        String followers,
        ArrayList<String> genres,
        String href,
        String name,
        Integer popularity,
        String type,
        String uri
    ){
        this.external_urls = external_urls;
        this.followers = followers;
        this.genres = genres;
        this.href = href;
        this.name = name;
        this.popularity = popularity;
        this.type = type;
        this.uri = uri;
    }

    public void setExternal_urls(String external_urls) {
        this.external_urls = external_urls;
    }
    public String getExternal_urls() {
        return external_urls;
    }
    public void setFollowers(String followers) {
        this.followers = followers;
    }
    public String getFollowers() {
        return followers;
    }
    public void setGenres(ArrayList<String> genres) {
        this.genres = genres;
    }
    public ArrayList<String> getGenres() {
        return genres;
    }
    public void setHref(String href) {
        this.href = href;
    }
    public String getHref() {
        return href;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }
    public Integer getPopularity() {
        return popularity;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setUri(String uri) {
        this.uri = uri;
    }
    public String getUri() {
        return uri;
    }
    
}
