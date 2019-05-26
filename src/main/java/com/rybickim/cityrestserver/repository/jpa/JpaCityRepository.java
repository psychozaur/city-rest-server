package com.rybickim.cityrestserver.repository.jpa;

import com.rybickim.cityrestserver.domain.CityEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface JpaCityRepository extends PagingAndSortingRepository<CityEntity, Long> {
}
