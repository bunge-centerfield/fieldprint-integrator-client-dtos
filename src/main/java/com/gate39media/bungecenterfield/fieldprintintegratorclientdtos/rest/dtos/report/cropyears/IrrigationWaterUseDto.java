package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.cropyears;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonIgnoreProperties(ignoreUnknown = true)
public class IrrigationWaterUseDto implements FieldprintResultsDto {
    private ValueUnitDto fieldprintResult;
    private Double scaledFieldprintResult;
    private ValueUnitDto totalWater;
    private ValueUnitDto yieldDifference;
    private BenchmarksDto benchmarks;

    @Override
    public FieldprintMetricType getType() {
        return FieldprintMetricType.IRRIGATION_WATER;
    }
}
