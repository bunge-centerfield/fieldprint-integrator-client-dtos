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
public class WaterQualityDto implements FieldprintResultsDto {
    private ValueUnitDto fieldprintResult;
    private Double scaledFieldprintResult;
    private LossPathwayDto lossPathway;
    private DerivedInputsDto derivedInputs;
    private FactorsDto factors;
    private IrrigationDto irrigation;
    private ConservationDto conservation;
    private BenchmarksDto benchmarks;

    @Override
    public FieldprintMetricType getType() {
        return FieldprintMetricType.WATER_QUALITY;
    }
}
