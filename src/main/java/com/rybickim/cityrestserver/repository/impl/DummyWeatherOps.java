package com.rybickim.cityrestserver.repository.impl;

import com.rybickim.cityrestserver.domain.CityEntity;
import com.rybickim.cityrestserver.domain.weather.Weather;
import com.rybickim.cityrestserver.repository.CityOperations;
import com.rybickim.cityrestserver.repository.WeatherOperations;
import com.rybickim.cityrestserver.repository.dummy.CityRepository;
import com.rybickim.cityrestserver.repository.dummy.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DummyWeatherOps implements WeatherOperations {

    private WeatherRepository weatherRepository;

    @Autowired
    public DummyWeatherOps(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    @Override
    public Weather readWeatherForACity(String city) {
        return weatherRepository.readWeatherForACity(city);
    }
}
