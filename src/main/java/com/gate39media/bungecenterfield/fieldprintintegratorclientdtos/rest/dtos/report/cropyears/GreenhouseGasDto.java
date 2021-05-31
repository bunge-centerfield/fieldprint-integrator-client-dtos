package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.cropyears;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.FieldprintValueUnitDto;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.ValueUnitDto;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.commons.FieldprintMetricType;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.commons.FieldprintResultsDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GreenhouseGasDto implements FieldprintResultsDto {
    private ValueUnitDto fieldprintResult;
    private Double scaledFieldprintResult;
    private ValueUnitDto totalGreenhouse;
    private FieldprintValueUnitDto management;
    private FieldprintValueUnitDto application;
    private FieldprintValueUnitDto manureLoading;
    private FieldprintValueUnitDto seed;
    private FieldprintValueUnitDto irrigation;
    private FieldprintValueUnitDto postHarvest;
    private FieldprintValueUnitDto transportation;
    private FieldprintValueUnitDto nitrousOxide;
    private FieldprintValueUnitDto rice;
    private FieldprintValueUnitDto residueBurning;
    private BenchmarksDto benchmarks;

    @Override
    public FieldprintMetricType getType() {
        return FieldprintMetricType.GREENHOUSE_GAS;
    }
}
