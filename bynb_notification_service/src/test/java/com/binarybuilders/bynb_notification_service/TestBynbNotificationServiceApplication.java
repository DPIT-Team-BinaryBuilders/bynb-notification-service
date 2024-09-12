package com.binarybuilders.bynb_notification_service;

import org.springframework.boot.SpringApplication;

public class TestBynbNotificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(BynbNotificationServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
