package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator.cropyears;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.FieldprintValueUnitDto;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.FieldprintValueUnitDtoFixture;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.ValueUnitDtoFixure;

public class SoilConservationDtoFixture {

    public static SoilConservationDto newInstance() {
        final FieldprintValueUnitDto state = FieldprintValueUnitDtoFixture.fromValueAndUnitAndScaledFieldprintResult("acre / bushel", 0.02114609, 67.5);
        final FieldprintValueUnitDto national = FieldprintValueUnitDtoFixture.fromValueAndUnitAndScaledFieldprintResult("acre / bushel", 0.01998608, 67.5);
        final BenchmarksDto benchmarks = BenchmarksDtoFixture.fromStateAndNationalAndScaleBasis(national, state, "State");
        return SoilConservationDto.builder()
                .fieldprintWater(ValueUnitDtoFixure.fromUnitAndValue("ton / acre / year", 0.5463))
                .fieldprintWind(ValueUnitDtoFixure.fromUnitAndValue("ton / acre / year", 0.16906793))
                .fieldprintResult(ValueUnitDtoFixure.fromUnitAndValue("ton / acre / year", 0.7153679))
                .scaledFieldprintResult(1)
                .benchmarks(benchmarks)
                .build();
    }
}