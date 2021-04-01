package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.fielddata;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.serializers.FieldprintGeolocationSerializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FieldDataLocationsDto {
    @JsonSerialize(using = FieldprintGeolocationSerializer.class)
    private GeoLocationDto geojson;
}