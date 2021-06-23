package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.boundaries;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator.GeoJsonDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FieldDataBoundariesDto {
    private GeoJsonDto geojson;

    public static FieldDataBoundariesDto newInstance() {
        return new FieldDataBoundariesDto();
    }

    public static FieldDataBoundariesDto of(GeoJsonDto geojson) {
        final FieldDataBoundariesDto location = newInstance();
        location.geojson(geojson);
        return location;
    }

    public void geojson(final GeoJsonDto geolocation) {
        this.geojson = geolocation;
    }

}
