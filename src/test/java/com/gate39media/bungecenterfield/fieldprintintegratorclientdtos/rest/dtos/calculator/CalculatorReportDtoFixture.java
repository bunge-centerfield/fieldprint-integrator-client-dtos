package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator.cropyears.CropYearsDtoFixture;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator.metadata.MetadataDtoFixture;

import java.util.Collections;

public class CalculatorReportDtoFixture {

    public static CalculatorReportDto newInstance() {
        return CalculatorReportDto.builder()
                .metadata(MetadataDtoFixture.newInstance())
                .cropyears(Collections.singletonList(CropYearsDtoFixture.newInstance()))
                .build();
    }
}