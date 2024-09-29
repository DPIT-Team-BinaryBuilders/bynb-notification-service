//package com.binarybuilders.bynb_notification_service.service;
//
//import com.binarybuilders.bynb_notification_service.dto.LocationDto;
//import org.springframework.stereotype.Service;
//
//@Service
//public class DistanceService {
//
//    private static final int EARTH_RADIUS_KM = 6371;  // Earth radius in kilometers
//
//    public double calculateDistance(LocationDto userLocation, LocationDto dangerLocation) {
//        double latDistance = Math.toRadians(dangerLocation.getLatitude() - userLocation.getLatitude());
//        double lonDistance = Math.toRadians(dangerLocation.getLongitude() - userLocation.getLongitude());
//
//        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
//                + Math.cos(Math.toRadians(userLocation.getLatitude())) * Math.cos(Math.toRadians(dangerLocation.getLatitude()))
//                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
//
//        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
//        return EARTH_RADIUS_KM * c;
//    }
//}
