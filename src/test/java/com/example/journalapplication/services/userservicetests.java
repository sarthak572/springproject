package com.example.journalapplication.services;

import com.example.journalapplication.entity.dashboardentry;
import com.example.journalapplication.repository.dashboardrepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class userservicetests {

    @Autowired
    private dashboardrepository dbr;

        @Test
        public void testadd(){
//            assertEquals(4,2+2  );

            assertNotNull(dbr.findByName("fronx").isEmpty());
            assertNotNull(dbr.findByName("fronx"));

    }
    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "2,2,4",
            "5,5,10"
    })
    public void newtest(int a , int b , int expected){
            assertEquals(expected, a , b );
    }
}
