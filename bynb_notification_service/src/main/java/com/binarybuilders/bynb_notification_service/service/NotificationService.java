package com.binarybuilders.bynb_notification_service.service;

import com.binarybuilders.bynb_notification_service.client.RestTemplateService;
import com.binarybuilders.bynb_notification_service.dto.GetAllDangerByUserLocationDto;
import com.binarybuilders.bynb_notification_service.dto.LocationDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NotificationService {

    @Autowired
    private RestTemplateService restTemplateService;

    public GetAllDangerByUserLocationDto createNotification(LocationDto userLocation) {
        return restTemplateService.getDanger(userLocation);
    }

}
