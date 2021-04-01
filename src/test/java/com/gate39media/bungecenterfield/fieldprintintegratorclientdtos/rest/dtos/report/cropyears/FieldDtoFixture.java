package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.cropyears;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.ValueUnitDtoFixure;

public class FieldDtoFixture {

    public static FieldDto newInstance() {
        return FieldDto.builder()
                .index(6.6875)
                .hsgroup("C")
                .omcontent(ValueUnitDtoFixure.fromUnitAndValue("%", 2.0))
                .rainVegIndex(5.75)
                .slope(ValueUnitDtoFixure.fromUnitAndValue("%", 2.0))
                .build();
    }
}