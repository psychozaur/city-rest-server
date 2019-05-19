package com.rybickim.cityrestserver.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Configuration {

    private static final Logger logger = LoggerFactory.getLogger(Configuration.class);

    private String urlPattern;
    private String weatherApiKey;

    @Bean
    RestTemplate restTemplate(RestTemplateBuilder templateBuilder){
        return templateBuilder.build();
    }

    @Autowired
    public void setWeatherApiKey(@Value("${weather.api.key}") String key){
        logger.debug("setWeatherApiKey() from config: [{}]", key);
        this.weatherApiKey = key;
    }

    @Autowired
    public void setUrlPattern(@Value("${weather.url.pattern}") String urlPattern) {
        logger.debug("setUrl() from config: [{}]", urlPattern);
        this.urlPattern = urlPattern;
    }

    public String getUrlPattern() {
        return urlPattern;
    }

    public String getWeatherApiKey() {
        return weatherApiKey;
    }
}
