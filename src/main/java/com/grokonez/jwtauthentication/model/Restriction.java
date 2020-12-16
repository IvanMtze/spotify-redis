package com.grokonez.jwtauthentication.model;

import javax.persistence.*;

@Entity
@Table(name = "restriction")
public class Restriction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String type;
    String reason;

    public Restriction(Long id, String type, String reason) {
        this.id = id;
        this.type = type;
        this.reason = reason;
    }

    public Restriction() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}