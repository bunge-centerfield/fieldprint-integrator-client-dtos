package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator.cropyears;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.FieldprintValueUnitDto;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.FieldprintValueUnitDtoFixture;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.ValueUnitDtoFixure;

public class IrrigationWaterUseDtoFixture {

    public static IrrigationWaterUseDto newInstance() {
        final FieldprintValueUnitDto state = FieldprintValueUnitDtoFixture.fromValueAndUnitAndScaledFieldprintResult("acre_inch / bushel", 0.7871854, 67.5);
        final FieldprintValueUnitDto national = FieldprintValueUnitDtoFixture.fromValueAndUnitAndScaledFieldprintResult("acre_inch / bushel", 0.68039155, 67.5);
        final BenchmarksDto benchmarks = BenchmarksDtoFixture.fromStateAndNationalAndScaleBasis(national, state, "State");
        return IrrigationWaterUseDto.builder()
                .fieldprintResult(ValueUnitDtoFixure.fromUnitAndValue("acre_inch / bushel", 0.32))
                .scaledFieldprintResult(27.5)
                .totalWater(ValueUnitDtoFixure.fromUnitAndValue("acre_inch / acre", 8.0))
                .yieldDifference(ValueUnitDtoFixure.fromUnitAndValue("acre_inch / acre", 25.0))
                .benchmarks(benchmarks)
                .build();
    }
}