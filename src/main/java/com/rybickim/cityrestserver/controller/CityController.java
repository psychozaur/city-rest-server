package com.rybickim.cityrestserver.controller;

import com.rybickim.cityrestserver.domain.City;
import com.rybickim.cityrestserver.service.StartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class CityController {

    private static final Logger logger = LoggerFactory.getLogger(CityController.class);

    private static StartService startService;

    public CityController(StartService startService) {
        this.startService = startService;
    }

    @GetMapping("/cities")
    public List<City> getMyBestCities() {
        logger.debug("getMyBestCities() from CityController: " + startService.getMyCities());

        return startService.getMyCities();
    }
}
