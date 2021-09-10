package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.metadata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.ValueUnitDto;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SoilInfo {
    private ValueUnitDto clay;
    private String coKey;
    private String hsGroup;
    private Double kFactor;
    private String name;
    private ValueUnitDto omContent;
    private ValueUnitDto slope;
    private ValueUnitDto slopeLength;
    private String texture;
}
