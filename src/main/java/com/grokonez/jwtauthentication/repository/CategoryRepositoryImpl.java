package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.Category;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {
    private final RedisTemplate<Long, Category> redisTemplate;

    private final HashOperations hashOperations;

    public CategoryRepositoryImpl(RedisTemplate<Long, Category> redisTemplate) {
        this.redisTemplate = redisTemplate;
        hashOperations = redisTemplate.opsForHash();
    }

    @Override
    public void save(Category category) {

        hashOperations.put("USER", category.getId(), category);
    }

    @Override
    public Map<Long, Category> findAll() {

        return hashOperations.entries("CATEGORY");
    }

    @Override
    public Category findById(Long id) {
        return (Category) hashOperations.get("CATEGORY", id);
    }

    @Override
    public Boolean delete(Long id) {
        hashOperations.delete("CATEGORY", id);
        return true;
    }
}
