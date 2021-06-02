package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.ValueUnitDtoFixure;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.fielddata.GeoLocationDtoFixture;

import java.util.Collections;

public class JsonDtoFixture {

    public static JsonDto newInstance() {
        return JsonDto.builder()
                .plantableAcres(ValueUnitDtoFixure.fromUnitAndValue("ac", 70.5))
                .slope(ValueUnitDtoFixure.fromUnitAndValue("%", 2.0))
                .slopeLength(ValueUnitDtoFixure.fromUnitAndValue("ft", 300.0))
                .textureId(10)
                .omContent(ValueUnitDtoFixure.fromUnitAndValue("%", 2.0))
                .rotation(Collections.singletonList(RotationDtoFixture.newInstance()))
                .build();
    }
}