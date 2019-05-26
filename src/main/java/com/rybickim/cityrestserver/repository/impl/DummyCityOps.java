package com.rybickim.cityrestserver.repository.impl;

import com.rybickim.cityrestserver.domain.CityEntity;
import com.rybickim.cityrestserver.repository.CityOperations;
import com.rybickim.cityrestserver.repository.dummy.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DummyCityOps implements CityOperations {

    private CityRepository cityRepository;

    @Autowired
    public DummyCityOps(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public List<CityEntity> readCitiesFromRepository() {
        return cityRepository.readCitiesFromRepository();
    }

    @Override
    public List<CityEntity> readCitiesFromRepository(int pageNumber, int noOfElements) {
        return null;
    }
}
