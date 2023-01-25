package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GeoJsonDto {
    private String type;
    private List<List<List<Double>>> coordinates;

    public static GeoJsonDto newInstance() {
        return new GeoJsonDto();
    }

    public static GeoJsonDto of(final String type, final List coordinates) {
        final GeoJsonDto geolocation = newInstance();
        geolocation.type(type);
        geolocation.coordinates(coordinates);
        return geolocation;
    }

    public void type(final String type) {
        this.type = type;
    }

    public void coordinates(final List coordinates) {
        this.coordinates = coordinates;
    }

}
