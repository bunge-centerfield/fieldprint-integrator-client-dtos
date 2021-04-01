package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.cropyears;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.ValueUnitDtoFixure;

public class PracticesDtoFixture {

    public static PracticesDto fromMethod(String method) {
        return PracticesDto.builder()
                .adjustment(ValueUnitDtoFixure.fromUnitAndValue("%", 42.5))
                .adjustedIndex(5.85)
                .method(method)
                .build();
    }
}