package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldprintValueUnitDto {
    private ValueUnitDto fieldprintResult;
    private Double scaledFieldprintResult;
    private ValueUnitDto energy;
    private ValueUnitDto greenhouse;
    private String lrr;
    private FieldprintValueUnitDto seedTreatment;
    private FieldprintValueUnitDto fertilizers;
    private FieldprintValueUnitDto protectants;
    private FieldprintValueUnitDto fieldOps;
    private FieldprintValueUnitDto lime;
}
