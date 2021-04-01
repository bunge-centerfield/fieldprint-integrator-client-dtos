package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.cropyears;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.FieldprintValueUnitDto;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.FieldprintValueUnitDtoFixture;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.ValueUnitDtoFixure;

public class SoilCarbonDtoFixture {

    public static SoilCarbonDto newInstance() {
        final FieldprintValueUnitDto national = FieldprintValueUnitDtoFixture.fromValueAndIndexAndScaledFieldprintResult("SCI", 0.0, 67.5);
        final BenchmarksDto benchmarks = BenchmarksDtoFixture.fromStateAndNationalAndScaleBasis(national, null, "Neutral");
        return SoilCarbonDto.builder()
                .fieldprintResult(ValueUnitDtoFixure.fromIndexAndValue("SCI", 0.264))
                .scaledFieldprintResult(36.8)
                .modelOutput(0.032)
                .benchmarks(benchmarks)
                .build();
    }
}