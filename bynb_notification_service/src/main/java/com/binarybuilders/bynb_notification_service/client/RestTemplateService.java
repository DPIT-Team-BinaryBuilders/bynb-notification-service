package com.binarybuilders.bynb_notification_service.client;

import com.binarybuilders.bynb_notification_service.dto.GetAllDangerByUserLocationDto;
import com.binarybuilders.bynb_notification_service.dto.LocationDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class RestTemplateService {

    private final RestTemplate restTemplate;

    public GetAllDangerByUserLocationDto getDanger(LocationDto userLocation) {
        String url = "http://localhost:8083/danger/get";
        return restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(userLocation), GetAllDangerByUserLocationDto.class).getBody();
    }
}
