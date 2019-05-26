package com.rybickim.cityrestserver.repository.jpa;

import com.rybickim.cityrestserver.domain.weather.Weather;
import org.springframework.data.repository.CrudRepository;

public interface JpaWeatherRepository extends CrudRepository<Weather, Long> {
}
