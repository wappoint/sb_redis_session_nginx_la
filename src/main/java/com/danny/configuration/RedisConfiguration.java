package com.danny.configuration;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @author 676002187@qq.com
 */
@Configuration
@EnableCaching
@EnableRedisHttpSession
public class RedisConfiguration {
}
