package com.example.journalapplication.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailServiceTest {

    @Autowired
    private EmailService emailService;

    @Test
    void testSendEmail() {
        emailService.sendmail("sarthakbansal2023@gmail.com", "Testing Java Mail Sender", "Hi, how are you?");
    }
}
