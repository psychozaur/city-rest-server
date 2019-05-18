package com.rybickim.cityrestserver.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class City {
    private String cityName;
    private int population;

//    public static void main(String[] args) {
//        City city = new City("wawa", 1);
//    }
}
