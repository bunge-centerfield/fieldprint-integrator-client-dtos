package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.cropyears;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.ValueUnitDtoFixure;

public class BiodiversityDtoFixture {

    public static BiodiversityDto newInstance() {
        return BiodiversityDto.builder()
                .fieldprintResult(ValueUnitDtoFixure.fromIndexAndValue("HPI", 0.62857145))
                .scaledFieldprintResult(37.14285714)
                .cultivatedLandScore(700)
                .fieldScore(440)
                .build();
    }
}