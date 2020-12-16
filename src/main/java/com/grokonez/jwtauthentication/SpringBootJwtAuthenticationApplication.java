package com.grokonez.jwtauthentication;

import com.grokonez.jwtauthentication.model.Playlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class SpringBootJwtAuthenticationApplication {

    @Bean
	JedisConnectionFactory jedisConnectionFactory() {
		RedisStandaloneConfiguration redisStandaloneConfiguration = 
			new RedisStandaloneConfiguration("104.198.244.0", 6379);
			//new RedisStandaloneConfiguration("0.0.0.0", 32768);

		return new JedisConnectionFactory(redisStandaloneConfiguration);
    }
    
    @Bean
	RedisTemplate<Long, Playlist> redisTemplate() {
		RedisTemplate<Long, Playlist> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(jedisConnectionFactory());
		return redisTemplate;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJwtAuthenticationApplication.class, args);
	}
}
