package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.cropyears;

import com.fasterxml.jackson.annotation.JsonInclude;
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
public class SoilConservationDto implements FieldprintResultsDto {
    private ValueUnitDto fieldprintWater;
    private ValueUnitDto fieldprintWind;
    private ValueUnitDto fieldprintResult;
    private Double scaledFieldprintResult;
    private BenchmarksDto benchmarks;

    @Override
    public FieldprintMetricType getType() {
        return FieldprintMetricType.SOIL_CONSERVATION;
    }
}
