package com.example.journalapplication.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class scheduleandsendemail {
    @Autowired
    private EmailService emailService;

    @Scheduled(cron = "0 0 16 1/1 * ? ")
    public void sendemail(){
        emailService.sendmail("sarthakbansal2023@gmail.com",
                "hello ",
                "hello from sarthak bansal ");
    }
}
