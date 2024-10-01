package com.binarybuilders.bynb_notification_service.client;

import com.binarybuilders.bynb_notification_service.dto.GetAllDangerByUserLocationDto;
import com.binarybuilders.bynb_notification_service.dto.LocationDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
@RequiredArgsConstructor
public class RestTemplateService {

    private final RestTemplate restTemplate;

    public GetAllDangerByUserLocationDto getDanger(LocationDto userLocation) {
        String url = "http://localhost:8083/danger/get";
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("latitude", userLocation.getLat())
                .queryParam("longitude", userLocation.getLng());
        return restTemplate.exchange(builder.toUriString(), HttpMethod.GET, new HttpEntity<>(new HttpHeaders()), GetAllDangerByUserLocationDto.class).getBody();
    }
}
