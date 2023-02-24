package com.jsn.hashicorp.vault.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Configuration
@ConfigurationProperties("app.config.auth")
public class AppConfig {
    private String username;
    private String token;
}
