package com.rybickim.cityrestserver.domain.weather;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Coordinates {

    private double lon;
    private double lat;
}
