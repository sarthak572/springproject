//package com.example.journalapplication.controller;
//
//import com.example.journalapplication.entity.journalentry;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/_journal")
//public class journalentrycontroller {
//
//    // Corrected naming convention for variables
//    private Map<Long, journalentry> journalEntries = new HashMap<>();
//
//    @GetMapping  // Added mapping to expose the method as an API endpoint
//    public ArrayList<journalentry> getAll() {
//        // Correctly retrieve all values from the map
//        return new ArrayList<>(journalEntries.values());
//    }
//
//    @PostMapping
//    public boolean createentry(@RequestBody journalentry myentry){
//        journalEntries.put(myentry.getId(), myentry);
//        return true;
//    }
//    @GetMapping("id/{myid}")
//    public journalentry getjournalentrybyid(@PathVariable Long myid){
//        return journalEntries.get(myid);
//    }
//
//    @DeleteMapping("id/{myid}")
//    public journalentry deletejournalentrybyid(@PathVariable Long myid){
//        return journalEntries.remove(myid);
//    }
//    @PutMapping("id/{myid}")
//    public journalentry updatejournelentrybyid(@PathVariable Long myid, @RequestBody journalentry myentry){
//        return journalEntries.put(myid,myentry);
//    }
//
//}
