package com.example.journalapplication.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "dashboard")
public class dashboardentry {


    @Id
    private String name;
    private String carname;
    private String model;
    private String price;

}
