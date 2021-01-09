package com.grokonez.jwtauthentication.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "audiofeature")
public class AudioFeatures implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Float acousticness;

    @Size(min = 1, max = 100)
    String analysis_url;

    Float danceability;

    Integer duration_ms;

    Float energy;

    Float instrulmentalness;

    Integer key;

    Float liveness;

    Float loudness;

    Integer mode;

    Float speechiness;

    Float tempo;

    Integer time_signature;

    @Size(min = 1, max = 100)
    String track_href;

    @Size(min = 1, max = 100)
    String type;

    @Size(min = 1, max = 100)
    String uri;

    Float valance;

    public AudioFeatures() {
    }

    public AudioFeatures(Long id, Float acousticness, String analysis_url, Float danceability, Integer duration_ms, Float energy, Float instrulmentalness, Integer key, Float liveness, Float loudness, Integer mode, Float speechiness, Float tempo, Integer time_signature, String track_href, String type, String uri, Float valance) {
        this.id = id;
        this.acousticness = acousticness;
        this.analysis_url = analysis_url;
        this.danceability = danceability;
        this.duration_ms = duration_ms;
        this.energy = energy;
        this.instrulmentalness = instrulmentalness;
        this.key = key;
        this.liveness = liveness;
        this.loudness = loudness;
        this.mode = mode;
        this.speechiness = speechiness;
        this.tempo = tempo;
        this.time_signature = time_signature;
        this.track_href = track_href;
        this.type = type;
        this.uri = uri;
        this.valance = valance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getAcousticness() {
        return acousticness;
    }

    public void setAcousticness(Float acousticness) {
        this.acousticness = acousticness;
    }

    public String getAnalysis_url() {
        return analysis_url;
    }

    public void setAnalysis_url(String analysis_url) {
        this.analysis_url = analysis_url;
    }

    public Float getDanceability() {
        return danceability;
    }

    public void setDanceability(Float danceability) {
        this.danceability = danceability;
    }

    public Integer getDuration_ms() { return duration_ms; }

    public void setDuration_ms(Integer duration_ms) {
        this.duration_ms = duration_ms;
    }

    public Float getEnergy() {
        return energy;
    }

    public void setEnergy(Float energy) {
        this.energy = energy;
    }

    public Float getInstrulmentalness() {
        return instrulmentalness;
    }

    public void setInstrulmentalness(Float instrulmentalness) {
        this.instrulmentalness = instrulmentalness;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Float getLiveness() {
        return liveness;
    }

    public void setLiveness(Float liveness) {
        this.liveness = liveness;
    }

    public Float getLoudness() {
        return loudness;
    }

    public void setLoudness(Float loudness) {
        this.loudness = loudness;
    }

    public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
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

    public Integer getTime_signature() {
        return time_signature;
    }

    public void setTime_signature(Integer time_signature) {
        this.time_signature = time_signature;
    }

    public String getTrack_href() {
        return track_href;
    }

    public void setTrack_href(String track_href) {
        this.track_href = track_href;
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

    public Float getValance() {
        return valance;
    }

    public void setValance(Float valance) {
        this.valance = valance;
    }
}
