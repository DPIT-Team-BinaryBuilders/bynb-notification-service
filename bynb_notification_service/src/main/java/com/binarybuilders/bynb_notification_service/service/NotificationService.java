package com.binarybuilders.bynb_notification_service.service;

import com.binarybuilders.bynb_notification_service.dto.LocationDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Autowired
    private DistanceService distanceService;

    private LocationDto userLocation;
    private LocationDto dangerLocation;

    @RabbitListener(queues = "user.location.queue")
    public void receiveUserLocation(LocationDto userLocation) {
        this.userLocation = userLocation;
        checkAndCalculateDistance();
    }

    @RabbitListener(queues = "danger.location.queue")
    public void receiveDangerLocation(LocationDto dangerLocation) {
        this.dangerLocation = dangerLocation;
        checkAndCalculateDistance();
    }

    private void checkAndCalculateDistance() {
        // Ensure both locations are available before calculating distance
        if (userLocation != null && dangerLocation != null) {
            double distance = distanceService.calculateDistance(userLocation, dangerLocation);
            System.out.println("Distance between user and danger is: " + distance + " km");

            // Reset locations after calculation
            userLocation = null;
            dangerLocation = null;
        }
    }
}
