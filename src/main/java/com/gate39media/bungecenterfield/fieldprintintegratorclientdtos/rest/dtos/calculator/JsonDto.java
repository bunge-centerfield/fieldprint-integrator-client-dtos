package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.ValueUnitDto;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.fielddata.GeoLocationDto;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.serializers.FieldprintFieldDataSSURGOSerializer;
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
public class JsonDto {
    @JsonSerialize(using = FieldprintFieldDataSSURGOSerializer.class)
    private GeoLocationDto geojson;
    @JsonProperty("plantable_acres")
    private ValueUnitDto plantableAcres;
    private ValueUnitDto slope;
    @JsonProperty("slope_length")
    private ValueUnitDto slopeLength;
    @JsonProperty("texture_id")
    private Integer textureId;
    @JsonProperty("om_content")
    private ValueUnitDto omContent;
    @JsonProperty("Rotation")
    private List<RotationDto> rotation;
}
