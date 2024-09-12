package com.binarybuilders.bynb_notification_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BynbNotificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BynbNotificationServiceApplication.class, args);
	}

}
