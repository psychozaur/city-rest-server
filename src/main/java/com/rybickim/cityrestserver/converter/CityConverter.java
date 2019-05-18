package com.rybickim.cityrestserver.converter;

import com.rybickim.cityrestserver.data_transfer_object.CityDTO;
import com.rybickim.cityrestserver.domain.CityEntity;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class CityConverter implements Function<CityEntity, CityDTO> {

    @Override
    public CityDTO apply(CityEntity cityEntity) {
        return new CityDTO(cityEntity.getCityName(),cityEntity.getPopulation());
    }
}
