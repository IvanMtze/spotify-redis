package com.grokonez.jwtauthentication.model;

import java.io.Serializable;

public class AudioFeatures implements Serializable {
    private Float acousticness;
    private Float danceability;
    private Float energy;
    private Float instrumentalness;
    private Float liveness;
    private Float valence;
    private Float loudness;
    private Float speechiness;
    private Float tempo;
    private Float key;
    private Float time_signature;
    private String uri_song;

    public AudioFeatures(Float acousticness, Float danceability, Float energy, Float instrumentalness, Float liveness, Float valence, Float loudness, Float speechiness, Float tempo, Float key, Float time_signature, String uri_song) {
        this.acousticness = acousticness;
        this.danceability = danceability;
        this.energy = energy;
        this.instrumentalness = instrumentalness;
        this.liveness = liveness;
        this.valence = valence;
        this.loudness = loudness;
        this.speechiness = speechiness;
        this.tempo = tempo;
        this.key = key;
        this.time_signature = time_signature;
        this.uri_song = uri_song;
    }

    public AudioFeatures() {
    }

    public Float getAcousticness() {
        return acousticness;
    }

    public void setAcousticness(Float acousticness) {
        this.acousticness = acousticness;
    }

    public Float getDanceability() {
        return danceability;
    }

    public void setDanceability(Float danceability) {
        this.danceability = danceability;
    }

    public Float getEnergy() {
        return energy;
    }

    public void setEnergy(Float energy) {
        this.energy = energy;
    }

    public Float getInstrumentalness() {
        return instrumentalness;
    }

    public void setInstrumentalness(Float instrumentalness) {
        this.instrumentalness = instrumentalness;
    }

    public Float getLiveness() {
        return liveness;
    }

    public void setLiveness(Float liveness) {
        this.liveness = liveness;
    }

    public Float getValence() {
        return valence;
    }

    public void setValence(Float valence) {
        this.valence = valence;
    }

    public Float getLoudness() {
        return loudness;
    }

    public void setLoudness(Float loudness) {
        this.loudness = loudness;
    }

    public Float getSpeechiness() {
        return speechiness;
    }

    public void setSpeechiness(Float speechiness) {
        this.speechiness = speechiness;
    }

    public Float getTempo() {
        return tempo;
    }

    public void setTempo(Float tempo) {
        this.tempo = tempo;
    }

    public Float getKey() {
        return key;
    }

    public void setKey(Float key) {
        this.key = key;
    }

    public Float getTime_signature() {
        return time_signature;
    }

    public void setTime_signature(Float time_signature) {
        this.time_signature = time_signature;
    }

    public String getUri_song() {
        return uri_song;
    }

    public void setUri_song(String uri_song) {
        this.uri_song = uri_song;
    }
}
