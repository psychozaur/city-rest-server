package com.rybickim.cityrestserver.service;

import com.rybickim.cityrestserver.domain.City;
import com.rybickim.cityrestserver.repository.CityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class StartService {

    private static final Logger logger = LoggerFactory.getLogger(StartService.class);

    private CityRepository cityRepository;

    public StartService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<City> getMyCities(){
        logger.debug("getMyCities(): " + cityRepository.readCitiesFromRepository());

        return cityRepository.readCitiesFromRepository();
    }
}
