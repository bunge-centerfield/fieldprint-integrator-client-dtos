package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.fielddata;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GeoLocationDto {
    private String type;
    @NotNull
    @NotEmpty(message = "Coordinates cannot be empty!")
    private List<GeolocationCoordinatesDto> coordinates;

    public static GeoLocationDto newInstance() {
        return new GeoLocationDto();
    }

    public static GeoLocationDto of(final String type, final List<GeolocationCoordinatesDto> coordinates) {
        final GeoLocationDto geolocation = newInstance();
        geolocation.type(type);
        geolocation.coordinates(coordinates);
        return geolocation;
    }

    public void type(final String type) {
        this.type = type;
    }

    public void coordinates(final List<GeolocationCoordinatesDto> coordinates) {
        this.coordinates = coordinates;
    }
}
