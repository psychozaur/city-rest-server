package com.rybickim.cityrestserver.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class CityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cityName;
    private int population;

    public CityEntity() {
    }

    public CityEntity(String cityName, int population) {
        this.cityName = cityName;
        this.population = population;
    }
}
