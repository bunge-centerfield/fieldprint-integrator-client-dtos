package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.cropyears;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.FieldprintValueUnitDto;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.FieldprintValueUnitDtoFixture;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.ValueUnitDtoFixure;

import java.util.Collections;

public class LandUseDtoFixture {

    public static LandUseDto newInstance() {
        final FieldprintValueUnitDto state = FieldprintValueUnitDtoFixture.fromValueAndUnitAndScaledFieldprintResult("acre / bushel", 0.02114609, 67.5);
        final FieldprintValueUnitDto national = FieldprintValueUnitDtoFixture.fromValueAndUnitAndScaledFieldprintResult("acre / bushel", 0.01998608, 67.5);
        final BenchmarksDto benchmarks = BenchmarksDtoFixture.fromStateAndNationalAndScaleBasis(national, state, "State");
        return LandUseDto.builder()
                .fieldprintResult(ValueUnitDtoFixure.fromUnitAndValue("acre / bushel", 0.01333333))
                .scaledFieldprintResult(3)
                .yieldAdjusted(ValueUnitDtoFixure.fromUnitAndValue("bushel / acre", 75.0))
                .abandonment(Collections.emptyList())
                .benchmarks(benchmarks)
                .build();
    }

}