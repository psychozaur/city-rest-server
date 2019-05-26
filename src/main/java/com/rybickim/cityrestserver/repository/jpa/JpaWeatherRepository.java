package com.rybickim.cityrestserver.repository.jpa;

import com.rybickim.cityrestserver.domain.weather.Weather;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface JpaWeatherRepository extends PagingAndSortingRepository<Weather, Long> {

    public Optional<Weather> findByCity(String city);
}
