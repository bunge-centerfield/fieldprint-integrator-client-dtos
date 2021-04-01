package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.fielddata;

public class FieldDataLocationsDtoFixture {

    public static FieldDataLocationsDto newInstance() {
        return FieldDataLocationsDto.builder().geojson(GeoLocationDtoFixture.newInstance()).build();
    }
}