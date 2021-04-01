package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.fielddata;

public class CoordinatesDtoFixture {

    public static CoordinatesDto newInstance() {
        return CoordinatesDto.builder().latitude(-115.972587073854).longitude(44.1028343904066).build();
    }

    public static CoordinatesDto fromLatAndLong(Double latitude, Double longitude) {
        return CoordinatesDto.builder().latitude(latitude).longitude(longitude).build();
    }
}