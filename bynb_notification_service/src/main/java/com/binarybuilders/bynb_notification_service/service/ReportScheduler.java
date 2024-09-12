package com.binarybuilders.bynb_notification_service.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class ReportScheduler {
    @Scheduled(fixedDelay = 5000)
    public void distributeReports() throws InterruptedException {
        System.out.println( "Reports distribution started at " + new Timestamp(System.currentTimeMillis()));
        System.out.println( "Distributing Executive Management Reports...");
        Thread.sleep(1000);
        System.out.println( "Distributing Facility Manager Reports...");
        Thread.sleep(1000);
        System.out.println( "Distributing Operations Reports...");
        Thread.sleep(1000);
        System.out.println( "Report distribution ended at " + new Timestamp(System.currentTimeMillis()));
    }
}
