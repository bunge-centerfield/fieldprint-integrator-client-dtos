package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.ValueUnitDtoFixure;

public class FertAppsDtoFixture {

    public static FertAppsDto newInstance() {
        return FertAppsDto.builder()
                .fertId("16")
                .fertilizerAmount(ValueUnitDtoFixure.newInstance())
                .slowRelease(true)
                .build();
    }
}