package com.rybickim.cityrestserver.domain.weather;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.java.Log;

@Data
@AllArgsConstructor
public class Coordinates {

    private double lon;
    private double lat;
}
