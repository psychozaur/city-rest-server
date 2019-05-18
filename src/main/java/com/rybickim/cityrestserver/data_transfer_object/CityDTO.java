package com.rybickim.cityrestserver.data_transfer_object;

public class CityDTO {

    private String cityName;
    private int population;

    public CityDTO(String cityName, int population) {
        this.cityName = cityName;
        this.population = population;
    }

    @Override
    public String toString() {
        return "CityDTO{" +
                "cityName='" + cityName + '\'' +
                ", population=" + population +
                '}';
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
