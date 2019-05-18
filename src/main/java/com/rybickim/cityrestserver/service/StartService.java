package com.rybickim.cityrestserver.service;

import com.rybickim.cityrestserver.domain.City;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class StartService {

    private static final Logger logger = LoggerFactory.getLogger(StartService.class);

    private List<City> myCities;

    public StartService(List<City> myCities) {
        this.myCities = myCities;
    }

    public List<City> getMyCities(){
        return this.myCities;
    }
}
