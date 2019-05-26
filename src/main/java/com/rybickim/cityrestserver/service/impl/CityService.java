package com.rybickim.cityrestserver.service.impl;

import com.rybickim.cityrestserver.converter.CityConverter;
import com.rybickim.cityrestserver.data_transfer_object.CityDTO;
import com.rybickim.cityrestserver.repository.dummy.impl.CityRepository;
import com.rybickim.cityrestserver.service.StartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CityService implements StartService {

    private static final Logger logger = LoggerFactory.getLogger(CityService.class);

    private CityRepository cityRepository;
    private CityConverter cityConverter;

    @Autowired
    public CityService(@Qualifier("cityRepo") CityRepository dataRepository, CityConverter cityConverter) {
        this.cityRepository = dataRepository;
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
