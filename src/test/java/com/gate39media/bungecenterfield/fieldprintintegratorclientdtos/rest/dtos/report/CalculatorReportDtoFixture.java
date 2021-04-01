package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.CalculatorReportDto;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.cropyears.CropYearsDtoFixture;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.metadata.MetadataDtoFixture;

import java.util.Collections;

public class CalculatorReportDtoFixture {

    public static CalculatorReportDto newInstance() {
        return CalculatorReportDto.builder()
                .metadata(MetadataDtoFixture.newInstance())
                .cropyears(Collections.singletonList(CropYearsDtoFixture.newInstance()))
                .build();
    }
}