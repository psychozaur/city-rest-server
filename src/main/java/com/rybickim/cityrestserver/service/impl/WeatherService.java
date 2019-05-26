package com.rybickim.cityrestserver.service.impl;

import com.rybickim.cityrestserver.domain.weather.Weather;
import com.rybickim.cityrestserver.repository.WeatherOperations;
import com.rybickim.cityrestserver.repository.dummy.WeatherRepository;
import com.rybickim.cityrestserver.service.StartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class WeatherService implements StartService {

    private static final Logger logger = LoggerFactory.getLogger(WeatherService.class);

    private WeatherOperations weatherRepository;

    public WeatherService(@Qualifier("weatherRepo") WeatherOperations weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    public Weather getWeather(String city){
        return weatherRepository.readWeatherForACity(city);
    }
}
