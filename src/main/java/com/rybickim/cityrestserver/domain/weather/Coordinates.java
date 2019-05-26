package com.rybickim.cityrestserver.domain.weather;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coordinates {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double lon;
    private double lat;
}
