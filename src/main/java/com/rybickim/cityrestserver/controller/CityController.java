package com.rybickim.cityrestserver.controller;

import com.rybickim.cityrestserver.data_transfer_object.CityDTO;
import com.rybickim.cityrestserver.domain.weather.Weather;
import com.rybickim.cityrestserver.repository.impl.WeatherRepository;
import com.rybickim.cityrestserver.service.StartService;
import com.rybickim.cityrestserver.service.impl.CityService;
import com.rybickim.cityrestserver.service.impl.WeatherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/cities/{id}")
    public CityDTO getCityById(@PathVariable("id") Long id) {
        logger.debug("getCityById() with id [{}]", id);

        CityDTO dummyResult = new CityDTO("Moscow", 3);

        logger.debug("city of id [{}] is [{}]", id, dummyResult);
        return dummyResult;

//        return cityService.getMyCities().get((id.intValue()));
    }

    // TODO install RabbitMQ
    // najpierw maszyna wirtualna Erlanga
    // a potem RabbitMQ - kolejka (np. producent-konsument, ale persistent!)

    @PostMapping("/cities")
    public String createCity(@RequestBody CityDTO newCity) {
        logger.debug("createCity(), newCity: [{}]", newCity);

        CityDTO persisted = new CityDTO(newCity.getCityName(), newCity.getPopulation(), 1L);

        return persisted.toString();
    }

    @DeleteMapping("/cities/{id}")
    public String deleteCityById(@PathVariable("id") Long id){
        logger.debug("deleteCityById() with id [{}]", id);

        return "Deleted successfully";
    }

    //pamietaj o zgodnych nazwach pol :P
    @PutMapping("/cities")
    public CityDTO updateCity(@RequestBody CityDTO toUpdate){
        logger.debug("updateCityById(): [{}]", toUpdate);

        return toUpdate;
    }


    @GetMapping("/weather")
    public Weather getMyWeather() {
        logger.debug("getMyWeather() from CityController: " + weatherService.getWeather("Warsaw"));

        return weatherService.getWeather("Warsaw");
    }
}
