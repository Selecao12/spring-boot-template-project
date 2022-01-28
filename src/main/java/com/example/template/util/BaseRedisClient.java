package com.example.template.util;

import com.example.template.config.RedisConfig;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.stereotype.Component;

@Component
public class BaseRedisClient {

    private final RedissonClient redissonClient;

    public BaseRedisClient(RedisConfig redisConfig) {
        final Config config = new Config();
        config.useSingleServer().setAddress(redisConfig.singleAddress());

        redissonClient = Redisson.create(config);
    }
}
