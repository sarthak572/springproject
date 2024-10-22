package com.example.journalapplication.services;

import com.example.journalapplication.entity.journalentry;
import com.example.journalapplication.entity.userentry;
import com.example.journalapplication.repository.journalentryrepository;
import com.example.journalapplication.repository.userrepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class userservice {
    @Autowired
    private userrepository userrepository;

    public void saveentry(userentry userentry){
        userrepository.save(userentry) ;
    }
    public List<userentry> getall(){
        return userrepository.findAll();
    }
    public Optional<userentry> findbyid(ObjectId id){
        return userrepository.findById(id);
    }
    public void deletebyid(ObjectId id){
        userrepository.deleteById(id);
    }
    public userentry findByUserName(String userName){
        return userrepository.findByuserName(userName);
    }

}
