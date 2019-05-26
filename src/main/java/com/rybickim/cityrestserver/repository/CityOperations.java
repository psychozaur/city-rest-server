package com.rybickim.cityrestserver.repository;

import com.rybickim.cityrestserver.domain.CityEntity;

import java.util.List;

public interface CityOperations {

//    TODO add paging!! List to Iterable ??
    public List<CityEntity> readCitiesFromRepository();

    public List<CityEntity> readCitiesFromRepository(int pageNumber, int noOfElements);
}
