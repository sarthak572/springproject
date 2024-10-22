package com.example.journalapplication.services;

import com.example.journalapplication.entity.dashboardentry;
import com.example.journalapplication.repository.dashboardrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
public class dashboardservice {
    @Autowired
    private dashboardrepository dbr;
    public void savecar(dashboardentry data ){
        dbr.save(data);
    }
    public List<dashboardentry> getall(){
        return dbr.findAll();
    }
    public List<dashboardentry> getEntriesByName(String name) {
        return dbr.findByName(name);
    }
    public List<dashboardentry> getentriesBymodel(String model){
        return dbr.findByModel(model);
    }
    public void deletebyname(String name){
        dbr.deleteById(name);
    }
}
