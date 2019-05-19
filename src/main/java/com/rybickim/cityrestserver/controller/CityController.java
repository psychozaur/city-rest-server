package com.rybickim.cityrestserver.controller;

import com.rybickim.cityrestserver.data_transfer_object.CityDTO;
import com.rybickim.cityrestserver.domain.weather.Weather;
import com.rybickim.cityrestserver.repository.impl.WeatherRepository;
import com.rybickim.cityrestserver.service.StartService;
import com.rybickim.cityrestserver.service.impl.CityService;
import com.rybickim.cityrestserver.service.impl.WeatherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {

    private static final Logger logger = LoggerFactory.getLogger(CityController.class);

    private CityService cityService;
    private WeatherService weatherService;

    public CityController(CityService cityService, WeatherService weatherService) {
        this.cityService = cityService;
        this.weatherService = weatherService;
    }

    @GetMapping("/cities")
    public List<CityDTO> getMyBestCities() {
        logger.debug("getMyBestCities() from CityController: " + cityService.getMyCities());

        return cityService.getMyCities();
    }

    @GetMapping("/weather")
    public Weather getMyWeather() {
        logger.debug("getMyWeather() from CityController: " + weatherService.getWeather("Warsaw"));

        return weatherService.getWeather("Warsaw");
    }
}
