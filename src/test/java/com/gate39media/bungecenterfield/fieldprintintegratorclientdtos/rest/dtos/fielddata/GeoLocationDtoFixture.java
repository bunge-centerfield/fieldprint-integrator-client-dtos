package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.fielddata;

import java.util.Arrays;

public class GeoLocationDtoFixture {

    public static GeoLocationDto newInstance() {
        return GeoLocationDto.builder()
                .type("Polygon")
                .coordinates(Arrays.asList(
                        CoordinatesDtoFixture.fromLatAndLong(-115.972587073854, 44.1028343904066),
                        CoordinatesDtoFixture.fromLatAndLong(-115.967866385983, 44.1004306030736),
                        CoordinatesDtoFixture.fromLatAndLong(-115.976106132082, 44.0925405630033),
                        CoordinatesDtoFixture.fromLatAndLong(-115.981427634765, 44.0958076604296),
                        CoordinatesDtoFixture.fromLatAndLong(-115.972587073854, 44.1028343904066)
                ))
                .build();
    }
}