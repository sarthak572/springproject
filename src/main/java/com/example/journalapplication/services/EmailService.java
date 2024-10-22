package com.example.journalapplication.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.task.TaskSchedulingProperties;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender sender;

    public void sendmail(String to, String subject , String body ){
        try {
            SimpleMailMessage mail= new SimpleMailMessage();
            mail.setFrom("sarthakbansal1604@gmail.com");
            mail.setTo(to);
            mail.setSubject(subject);
            mail.setText(body);
            sender.send(mail) ;
            System.out.println("mail sent");
        }
        catch(Exception e ){
            System.out.println("error while sending the email");
            e.printStackTrace();
        }
    }
}
