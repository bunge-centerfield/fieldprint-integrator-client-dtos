package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator.cropyears;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.ValueUnitDtoFixure;

public class WaterQualityDtoFixture {

    public static WaterQualityDto newInstance() {
        return WaterQualityDto.builder()
                .fieldprintResult(ValueUnitDtoFixure.fromIndexAndValue("WQI", 4.2609377))
                .scaledFieldprintResult(57.391)
                .factors(FactorsDtoFixture.newInstance())
                .irrigation(IrrigationDtoFixture.newInstance())
                .conservation(ConservationDtoFixture.newInstance())
                .build();
    }
}