package com.javawebservice.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyDataSouceConfig {

    @Autowired
    DummyDataSource datasource;

    @RequestMapping( value = "getDatConfig" , method = RequestMethod.GET)
    public DummyDataSource DataSource(){
        return datasource;
    }

}
