package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.fielddata;

public class CoordinatesDtoFixture {

    public static GeolocationCoordinatesDto newInstance() {
        return GeolocationCoordinatesDto.builder().latitude(-115.972587073854).longitude(44.1028343904066).build();
    }

    public static GeolocationCoordinatesDto fromLatAndLong(Double latitude, Double longitude) {
        return GeolocationCoordinatesDto.builder().latitude(latitude).longitude(longitude).build();
    }
}