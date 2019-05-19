package com.rybickim.cityrestserver.repository.impl;

import com.rybickim.cityrestserver.config.Configuration;
import com.rybickim.cityrestserver.domain.weather.Weather;
import com.rybickim.cityrestserver.repository.DataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
@Qualifier("weatherRepo")
public class WeatherRepository implements DataRepository {

    private static final Logger logger = LoggerFactory.getLogger(WeatherRepository.class);

    private RestTemplate restTemplate;
    private Configuration configuration;

    public WeatherRepository(RestTemplate restTemplate, Configuration configuration) {
        this.restTemplate = restTemplate;
        this.configuration = configuration;
        logger.debug("DataRepository(): " + restTemplate + ", " + configuration);
    }

    public Weather readWeatherForACity(String city) {
        logger.debug("readWeatherForACity(): [{}]", city);

        //buildUrl
        String url = String.format(configuration.getUrlPattern(), city, configuration.getWeatherApiKey());

        Weather response = restTemplate.getForObject(url, Weather.class);
        logger.debug("received response [{}]", response);

        return response;
    }
}
