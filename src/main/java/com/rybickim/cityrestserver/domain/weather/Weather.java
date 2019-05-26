package com.rybickim.cityrestserver.domain.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Coordinates coord;
    private TempPressure main;
}
