package com.rybickim.cityrestserver.repository.impl;

import com.rybickim.cityrestserver.domain.CityEntity;
import com.rybickim.cityrestserver.repository.CityOperations;
import com.rybickim.cityrestserver.repository.jpa.JpaCityRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public class JpaCityOps implements CityOperations {

    private JpaCityRepository jpaCityRepository;

    public JpaCityOps(JpaCityRepository jpaCityRepository) {
        this.jpaCityRepository = jpaCityRepository;
    }

    @Override
    public List<CityEntity> readCitiesFromRepository() {
        List<CityEntity> result = new ArrayList<>();

        // ten pomysł też zresztą ma tę samą wadę
        jpaCityRepository.findAll().forEach(x -> result.add(x));
//                kiepski pomysł, można zapchać bazę, jeśli są setki rekordów (problem performance'u)
//                return (List<CityEntity>) jpaCityRepository.findAll();

        return result;
    }

    @Override
    public List<CityEntity> readCitiesFromRepository(int pageNumber, int noOfElements) {
        return null;
    }
}