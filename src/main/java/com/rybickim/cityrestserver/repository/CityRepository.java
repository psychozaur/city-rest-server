package com.rybickim.cityrestserver.repository;

import com.rybickim.cityrestserver.domain.CityEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CityRepository {

    private static final Logger logger = LoggerFactory.getLogger(CityRepository.class);

    private List<CityEntity> cities = new ArrayList<>();

    public CityRepository() {
        logger.debug("CityRepository()");

        cities.add(new CityEntity("Wawa", 2));
        cities.add(new CityEntity("Krak", 2));
        cities.add(new CityEntity("Wro", 2));

        logger.debug("cities: " + cities);
    }

    public List<CityEntity> readCitiesFromRepository(){

        logger.debug("readCitiesFromRepository(): " + cities);

        return cities;
    }
}
