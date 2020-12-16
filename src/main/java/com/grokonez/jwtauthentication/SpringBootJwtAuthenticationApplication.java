package com.grokonez.jwtauthentication;

import com.grokonez.jwtauthentication.model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class SpringBootJwtAuthenticationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJwtAuthenticationApplication.class, args);
    }

    @Bean
    JedisConnectionFactory jedisConnectionFactory() {
        RedisStandaloneConfiguration redisStandaloneConfiguration =
                new RedisStandaloneConfiguration("104.198.244.0", 6379);
        //new RedisStandaloneConfiguration("0.0.0.0", 32768);

        return new JedisConnectionFactory(redisStandaloneConfiguration);
    }

    @Bean
    RedisTemplate<Long, Playlist> redisPlaylistTemplate() {
        RedisTemplate<Long, Playlist> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(jedisConnectionFactory());
        return redisTemplate;
    }
    @Bean
    RedisTemplate<Long, Album> redisAlbumTemplate() {
        RedisTemplate<Long, Album> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(jedisConnectionFactory());
        return redisTemplate;
    }
    @Bean
    RedisTemplate<Long, AudioFeatures> redisAudioFeaturesTemplate() {
        RedisTemplate<Long, AudioFeatures> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(jedisConnectionFactory());
        return redisTemplate;
    }
    @Bean
    RedisTemplate<Long, Track> redisTrackTemplate() {
        RedisTemplate<Long, Track> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(jedisConnectionFactory());
        return redisTemplate;
    }
    @Bean
    RedisTemplate<Long, Category> redisCategoryTemplate() {
        RedisTemplate<Long, Category> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(jedisConnectionFactory());
        return redisTemplate;
    }
    @Bean
    RedisTemplate<Long, Playlist> redisTemplate() {
        RedisTemplate<Long, Playlist> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(jedisConnectionFactory());
        return redisTemplate;
    }
    @Bean
    RedisTemplate<Long, Artist> redisArtistTemplate() {
        RedisTemplate<Long, Artist> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(jedisConnectionFactory());
        return redisTemplate;
    }






}
