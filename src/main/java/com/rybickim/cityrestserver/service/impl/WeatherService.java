package com.rybickim.cityrestserver.service.impl;

import com.rybickim.cityrestserver.converter.CityConverter;
import com.rybickim.cityrestserver.data_transfer_object.CityDTO;
import com.rybickim.cityrestserver.domain.weather.Weather;
import com.rybickim.cityrestserver.repository.DataRepository;
import com.rybickim.cityrestserver.repository.impl.WeatherRepository;
import com.rybickim.cityrestserver.service.StartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WeatherService implements StartService {

    private static final Logger logger = LoggerFactory.getLogger(WeatherService.class);

    private WeatherRepository weatherRepository;

    public WeatherService(@Qualifier("weatherRepo") WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    public Weather getWeather(String city){
        return weatherRepository.readWeatherForACity(city);
    }
}
