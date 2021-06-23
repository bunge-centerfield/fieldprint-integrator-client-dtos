package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.fielddata;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GeolocationCoordinatesDto {
    private Double longitude;
    private Double latitude;

    public static GeolocationCoordinatesDto newInstance() {
        return new GeolocationCoordinatesDto();
    }

    public static GeolocationCoordinatesDto of(final Double longitude, final Double latitude) {
        final GeolocationCoordinatesDto coordinate = newInstance();
        coordinate.longitude(longitude);
        coordinate.latitude(latitude);
        return coordinate;
    }

    public void latitude(final Double latitude) {
        this.latitude = latitude;
    }

    public void longitude(final Double longitude) {
        this.longitude = longitude;
    }
}
