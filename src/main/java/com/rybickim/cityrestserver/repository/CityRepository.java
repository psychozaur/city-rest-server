package com.rybickim.cityrestserver.repository;

import com.rybickim.cityrestserver.domain.City;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CityRepository {

    private static final Logger logger = LoggerFactory.getLogger(CityRepository.class);

    private List<City> cities = new ArrayList<>();

    public CityRepository() {
        logger.debug("CityRepository()");

        cities.add(new City("Wawa", 2));
        cities.add(new City("Krak", 2));
        cities.add(new City("Wro", 2));

        logger.debug("cities: " + cities);
    }

    public List<City> readCitiesFromRepository(){

        logger.debug("readCitiesFromRepository(): " + cities);

        return cities;
    }
}
