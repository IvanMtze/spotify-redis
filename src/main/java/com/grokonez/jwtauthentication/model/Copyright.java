package com.grokonez.jwtauthentication.model;

import javax.persistence.*;

@Entity
@Table(name = "copyright")
public class Copyright {
    String copyright;
    String type;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Copyright(Long id, String copyright, String type) {
        this.id = id;
        this.copyright = copyright;
        this.type = type;
    }

    public Copyright() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
