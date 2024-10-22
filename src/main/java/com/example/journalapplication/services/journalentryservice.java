package com.example.journalapplication.services;

import com.example.journalapplication.entity.journalentry;
import com.example.journalapplication.entity.userentry;
import com.example.journalapplication.repository.journalentryrepository;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class journalentryservice {
    @Autowired
    private journalentryrepository journalentryrepository;





    public void saveentry(journalentry journalentry, String username){
        journalentryrepository.save(journalentry) ;
    }
    public List<journalentry> getall(){
        return journalentryrepository.findAll();
    }
    public Optional<journalentry> findbyid(ObjectId id){
        return journalentryrepository.findById(id);
    }
    public void deletebyid(ObjectId id){
        journalentryrepository.deleteById(id);
    }

}
