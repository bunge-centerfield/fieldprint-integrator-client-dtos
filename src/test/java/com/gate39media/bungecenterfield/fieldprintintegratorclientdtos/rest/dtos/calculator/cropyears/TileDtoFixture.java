package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator.cropyears;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.ValueUnitDtoFixure;

public class TileDtoFixture {

    public static TileDto newInstance() {
        return TileDto.builder()
                .adjustment(ValueUnitDtoFixure.fromUnitAndValue("%", 0.0))
                .method("No tile drainage system")
                .build();
    }
}