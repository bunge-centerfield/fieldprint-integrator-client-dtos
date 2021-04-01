package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.ValueUnitDtoFixure;

public class ManureAppDtoFixture {

    public static ManureAppDto newInstance() {
        return ManureAppDto.builder()
                .riceOrganicFertTypeId(1)
                .manureAmountId(1)
                .manureTypeId(1)
                .nApplied(ValueUnitDtoFixure.fromUnitAndValue("lb/ac", 10.0))
                .build();
    }
}