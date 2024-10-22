package com.example.journalapplication.controller;

import com.example.journalapplication.entity.dashboardentry;
import com.example.journalapplication.entity.userentry;
import com.example.journalapplication.services.dashboardservice;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dashboard")
public class dashboardcontroller {
    @Autowired
    private dashboardservice dbs;

    // Corrected GetMapping with PathVariable
    @GetMapping("/name/{name}")
    public ResponseEntity<List<dashboardentry>> getinfoofcar(@PathVariable String name) {
        List<dashboardentry> all = dbs.getEntriesByName(name);
        return new ResponseEntity<>(all, HttpStatus.OK);
    }
    @GetMapping("/model/{model}")
    public ResponseEntity<List<dashboardentry>> getbymodel(@PathVariable String model){
        List<dashboardentry> al= dbs.getentriesBymodel(model);
        return new ResponseEntity<>(al, HttpStatus.OK);
    }
    @DeleteMapping("/name/{name}")
    public ResponseEntity<?>  deletebyname(@PathVariable String name){
        dbs.deletebyname(name);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Corrected PostMapping with PathVariable
    @PostMapping
    public ResponseEntity<dashboardentry> createentry(@RequestBody dashboardentry myentry) {
        dbs.savecar(myentry);
        return new ResponseEntity<>(myentry, HttpStatus.CREATED);
    }
}
