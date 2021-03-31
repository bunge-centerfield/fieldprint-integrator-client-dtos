package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator.cropyears;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.FieldprintValueUnitDto;

public class BenchmarksDtoFixture {

    public static BenchmarksDto fromStateAndNationalAndScaleBasis(FieldprintValueUnitDto national, FieldprintValueUnitDto state, String scaleBasis) {
        return BenchmarksDto.builder()
                .national(national)
                .state(state)
                .scaleBasis(scaleBasis)
                .build();
    }
}