package com.grokonez.jwtauthentication.repository;


import com.grokonez.jwtauthentication.model.Category;

import java.util.Map;

public interface CategoryRepository {
    void save(Category playlist);

    Map<Long, Category> findAll();

    Category findById(Long id);

    Boolean delete(Long id);

}
