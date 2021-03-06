package com.grokonez.jwtauthentication.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.persistence.Basic;
import java.io.Serializable;

@Entity
@Table(name = "playlist")
public class Playlist implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min=1, max = 100)
    private String playlist;

    @Size(min=1, max = 100)
    private String pais;

    private Integer popularidad;

    @Basic
    private java.sql.Date diaCreado;

    public Playlist() {}

    public Playlist(String playlist, String pais, java.sql.Date diaCreado, Integer popularidad){
        this.playlist = playlist;
        this.pais = pais;
        this.popularidad = popularidad;
        this.diaCreado = diaCreado;
    }
    public Playlist(Long id, String playlist, String pais, java.sql.Date diaCreado, int popularidad){
        this.id = id;
        this.playlist = playlist;
        this.pais = pais;
        this.popularidad = popularidad;
        this.diaCreado = diaCreado;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public void setPlaylist(String playlist) {
        this.playlist = playlist;
    }
    public String getPlaylist() {
        return playlist;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getPais() {
        return pais;
    }
    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }
    public Integer getPopularidad() {
        return popularidad;
    }
    public void setDiaCreado(java.sql.Date diaCreado) {
        this.diaCreado = diaCreado;
    }
    public java.sql.Date getDiaCreado() {
        return diaCreado;
    }

}