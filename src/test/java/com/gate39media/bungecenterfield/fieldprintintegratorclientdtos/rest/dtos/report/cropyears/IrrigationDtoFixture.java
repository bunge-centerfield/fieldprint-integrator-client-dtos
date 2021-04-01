package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.cropyears;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.ValueUnitDtoFixure;

public class IrrigationDtoFixture {

    public static IrrigationDto newInstance() {
        return IrrigationDto.builder()
                .adjustment(ValueUnitDtoFixure.fromUnitAndValue("%", -10.0))
                .adjustedIndex(4.2609375)
                .method("Center Pivot")
                .build();
    }
}