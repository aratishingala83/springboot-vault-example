package com.jsn.hashicorp.vault.service;

import com.jsn.hashicorp.vault.config.AppConfig;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AppService {

    private final AppConfig appConfig;

    @PostConstruct
    public void readConfigs() {
        log.info("-------------------------------------------`\n");
        log.info("Reading configuration {} - {} \n", appConfig.getToken(), appConfig.getUsername());
        log.info("-------------------------------------------`\n");
    }

}