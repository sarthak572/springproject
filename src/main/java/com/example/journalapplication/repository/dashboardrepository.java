package com.example.journalapplication.repository;

import com.example.journalapplication.entity.dashboardentry;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface dashboardrepository extends MongoRepository<dashboardentry, String> {
    List<dashboardentry> findByName(String name);
    List<dashboardentry> findByModel(String model);
}
