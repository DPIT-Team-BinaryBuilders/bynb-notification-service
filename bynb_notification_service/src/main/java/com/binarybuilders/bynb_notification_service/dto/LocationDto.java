package com.binarybuilders.bynb_notification_service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocationDto {
    private double lat;
    private double lng;

    public LocationDto(double latitude, double longitude) {
        this.lat = latitude;
        this.lng = longitude;
    }

}
