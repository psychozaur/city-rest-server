package com.rybickim.cityrestserver.repository;

import com.rybickim.cityrestserver.domain.weather.Weather;

public interface WeatherOperations {

    public Weather readWeatherForACity(String city);
}
