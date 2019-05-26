package com.rybickim.cityrestserver.repository.impl;

import com.rybickim.cityrestserver.domain.CityEntity;
import com.rybickim.cityrestserver.domain.weather.Weather;
import com.rybickim.cityrestserver.repository.CityOperations;
import com.rybickim.cityrestserver.repository.WeatherOperations;
import com.rybickim.cityrestserver.repository.jpa.JpaCityRepository;
import com.rybickim.cityrestserver.repository.jpa.JpaWeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
@Qualifier("weatherRepo")
public class JpaWeatherOps implements WeatherOperations {

    private JpaWeatherRepository jpaWeatherRepository;

    @Autowired
    public JpaWeatherOps(JpaWeatherRepository jpaWeatherRepository) {
        this.jpaWeatherRepository = jpaWeatherRepository;
    }

    @Override
    public Weather readWeatherForACity(String city) {

        Weather result = new Weather();

        Optional<Weather> maybeWeather = jpaWeatherRepository.findByCity(city);
        if (maybeWeather.isPresent()){
            result = maybeWeather.get();
        }

        return result;
    }

}
