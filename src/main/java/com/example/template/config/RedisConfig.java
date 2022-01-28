package com.example.template.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "redis")
public record RedisConfig(
        String singleAddress
) {
}
