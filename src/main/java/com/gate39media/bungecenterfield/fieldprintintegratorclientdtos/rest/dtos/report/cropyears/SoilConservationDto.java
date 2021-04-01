package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.cropyears;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.ValueUnitDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SoilConservationDto {
    private ValueUnitDto fieldprintWater;
    private ValueUnitDto fieldprintWind;
    private ValueUnitDto fieldprintResult;
    private Integer scaledFieldprintResult;
    private BenchmarksDto benchmarks;
}
