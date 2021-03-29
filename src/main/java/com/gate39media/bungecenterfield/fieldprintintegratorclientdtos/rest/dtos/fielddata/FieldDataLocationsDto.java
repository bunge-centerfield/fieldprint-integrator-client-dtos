package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.fielddata;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.serializers.FieldprintFieldDataSSURGOSerializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonSerialize(using = FieldprintFieldDataSSURGOSerializer.class)
public class FieldDataLocationsDto {
    private GeoLocationDto geojson;
}