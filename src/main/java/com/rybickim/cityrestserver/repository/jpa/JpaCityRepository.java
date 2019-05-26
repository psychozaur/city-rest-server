package com.rybickim.cityrestserver.repository.jpa;

import com.rybickim.cityrestserver.domain.CityEntity;
import org.springframework.data.repository.CrudRepository;

public interface JpaCityRepository extends CrudRepository<CityEntity, Long> {
}
