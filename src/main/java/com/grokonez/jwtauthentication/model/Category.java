package com.grokonez.jwtauthentication.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
@Entity
@Table(name = "category")
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Size(min=1, max =100)
    String href;

    @Size(min=1, max = 100)
    String id_internal;

    @Size(min=1, max =100)
    String name;

    public Category() {
    }

    public Category(Long id, String href, String id_internal, String name) {
        this.id = id;
        this.href = href;
        this.id_internal = id_internal;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
