package com.binarybuilders.bynb_notification_service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetAllDangerByUserLocationDto {
    private int id;
    private String dangerName;
    private double latitude;
    private double longitude;

}
