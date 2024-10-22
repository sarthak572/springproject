package com.example.journalapplication.entity;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "Users")
public class userentry {
    @Getter
    @Setter

    @Id
    public ObjectId id;
    @Indexed(unique = true)
    @NonNull
    public String userName;
    @NonNull
    public String password;
    @DBRef
    private List<journalentry> journalEntries= new ArrayList<>();




}
