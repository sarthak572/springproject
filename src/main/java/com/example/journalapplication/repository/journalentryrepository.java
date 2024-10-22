package com.example.journalapplication.repository;

import com.example.journalapplication.entity.journalentry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface journalentryrepository extends MongoRepository<journalentry, ObjectId> {

}
