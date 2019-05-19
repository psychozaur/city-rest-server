package com.rybickim.cityrestserver.data_transfer_object;

public class CityDTO {

    private String cityName;
    private int population;
    //duży Long może mieć wartość 0 (pełnoprawna wartość ID, nie?), jest logika trójwartościowa itd.
    private Long id;

    public CityDTO() {
    }

    public CityDTO(String cityName, int population) {
        this.cityName = cityName;
        this.population = population;
    }

    public CityDTO(String cityName, int population, Long id) {
        this.cityName = cityName;
        this.population = population;
        this.id = id;
    }

    @Override
    public String toString() {
        return "CityDTO{" +
                "cityName='" + cityName + '\'' +
                ", population=" + population +
                ", id=" + id +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
