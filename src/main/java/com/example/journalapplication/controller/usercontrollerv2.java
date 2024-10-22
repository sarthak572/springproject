package com.example.journalapplication.controller;

import com.example.journalapplication.entity.journalentry;
import com.example.journalapplication.services.journalentryservice;
import com.example.journalapplication.entity.userentry;
import com.example.journalapplication.services.userservice;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class usercontrollerv2 {

    @Autowired
    private userservice userservice;

    @GetMapping
    public List<userentry> getalluser(){
    return userservice.getall();
    }

    @PostMapping
    public void createUser(@RequestBody userentry user){
        userservice.saveentry(user);
    }

//    @PutMapping
//    public ResponseEntity<?> updateUser(@RequestBody userentry user){
//        user userindb = userservice.findByUserName(user.getuserName);
//        if(userindb!= null){
//            userindb.userName(user.userName);
//        }
//    }

}
