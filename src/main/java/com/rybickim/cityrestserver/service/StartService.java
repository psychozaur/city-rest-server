package com.rybickim.cityrestserver.service;

import com.rybickim.cityrestserver.converter.CityConverter;
import com.rybickim.cityrestserver.data_transfer_object.CityDTO;
import com.rybickim.cityrestserver.repository.CityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StartService {

    private static final Logger logger = LoggerFactory.getLogger(StartService.class);

    private CityRepository cityRepository;
    private CityConverter cityConverter;

    public StartService(CityRepository cityRepository, CityConverter cityConverter) {
        this.cityRepository = cityRepository;
        this.cityConverter = cityConverter;
    }

    public List<CityDTO> getMyCities(){
        logger.debug("getMyCities()");

        return cityRepository.readCitiesFromRepository()
                .stream()
                .map(cityConverter::apply)
                .collect(Collectors.toList());
    }
}
