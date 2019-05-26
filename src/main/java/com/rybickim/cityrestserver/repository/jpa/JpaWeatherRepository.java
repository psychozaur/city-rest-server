package com.rybickim.cityrestserver.repository.jpa;

import com.rybickim.cityrestserver.domain.weather.Weather;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface JpaWeatherRepository extends PagingAndSortingRepository<Weather, Long> {
}
