package com.example.journalapplication.repository;

import com.example.journalapplication.entity.journalentry;
import com.example.journalapplication.entity.userentry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface userrepository extends MongoRepository<userentry, ObjectId> {
    userentry findByuserName(String userName);
}
