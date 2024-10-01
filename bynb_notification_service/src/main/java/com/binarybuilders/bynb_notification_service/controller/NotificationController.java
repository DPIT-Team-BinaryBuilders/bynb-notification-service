package com.binarybuilders.bynb_notification_service.controller;

import com.binarybuilders.bynb_notification_service.dto.GetAllDangerByUserLocationDto;
import com.binarybuilders.bynb_notification_service.dto.LocationDto;
import com.binarybuilders.bynb_notification_service.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    @Autowired
    NotificationService notificationService;

    @GetMapping("/new")
    public Boolean newNotification(@RequestBody LocationDto userLocation) {
        return notificationService.createNotification(userLocation);
    }
}
