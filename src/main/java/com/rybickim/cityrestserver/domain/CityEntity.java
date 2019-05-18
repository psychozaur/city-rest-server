package com.rybickim.cityrestserver.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CityEntity {
    private int repoId;
    private String cityName;
    private int population;

    public CityEntity(String cityName, int population) {
        this.cityName = cityName;
        this.population = population;
    }
}
