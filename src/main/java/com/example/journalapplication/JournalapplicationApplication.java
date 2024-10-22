package com.example.journalapplication;

import com.example.journalapplication.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JournalapplicationApplication {
	@Autowired
	private EmailService emailService;

	public static void main(String[] args) {
		SpringApplication.run(JournalapplicationApplication.class, args);
	}

//	@EventListener(ApplicationReadyEvent.class)
//	public void sendmail(){
//		emailService.sendmail("sarthakbansal2023@gmail.com","hi testing the app","heello");
//	}
}
