package com.example.journalapplication.controller;

import com.example.journalapplication.entity.journalentry;
import com.example.journalapplication.entity.userentry;
import com.example.journalapplication.services.journalentryservice;
import com.example.journalapplication.services.userservice;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.*;

@RestController
@RequestMapping("/journal")
public class journalentrycontrollerv2 {

    //    code to start logging the classes
    private static final Logger logger = LoggerFactory.getLogger(journalentrycontrollerv2.class);

    // Corrected naming convention for variables
    @Autowired
    private journalentryservice journalentryservice;
    @Autowired
    private userservice userservice;

    @GetMapping  // Added mapping to expose the method as an API endpoint

    public ResponseEntity<?> getAllJournalEntriesofuser(@PathVariable String username) {
        userentry user = userservice.findByUserName(username);
        List<journalentry> all= journalentryservice.getall();
        if(all != null && !all.isEmpty()){
            return new ResponseEntity<>(all, HttpStatus.OK) ;
        }
        // Correctly retrieve all values from the map
        logger.info("fakdsjjkafsdfjk");
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("{userName}")
    public ResponseEntity<journalentry> createentry(@RequestBody journalentry myentry,@PathVariable String userName){
//        myentry.setDate(LocalDateTime.now());
        try {
            userentry user = userservice.findByUserName(userName);
            myentry.setDate(LocalDateTime.now());
            journalentryservice.saveentry(myentry, userName);
            return new ResponseEntity<>(myentry, HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }
    @GetMapping("id/{myid}")
    public ResponseEntity<journalentry> getjournalentrybyid(@PathVariable ObjectId myid){
       Optional<journalentry> journalentry= journalentryservice.findbyid(myid);
       if(journalentry.isPresent()){
           return new ResponseEntity<>(journalentry.get(), HttpStatus.OK);
       }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("id/{myid}")
    public ResponseEntity<?> deletejournalentrybyid(@PathVariable ObjectId myid){
        journalentryservice.deletebyid(myid);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PutMapping("id/{myid}")
    public journalentry updatejournelentrybyid(@PathVariable ObjectId myid, @RequestBody journalentry myentry){
//        myentry.setDate(LocalDateTime.now());
//        journalentryservice.saveentry(myentry, user);
//        return myentry ;
        return null;
    }

}
