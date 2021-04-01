package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.cropyears.CropYearsDtoFixture;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.metadata.MetadataDtoFixture;

import java.util.Collections;

public class FieldprintCalculatorReportDtoFixture {

    public static FieldprintCalculatorReportDto newInstance() {
        return FieldprintCalculatorReportDto.builder()
                .metadata(MetadataDtoFixture.newInstance())
                .cropyears(Collections.singletonList(CropYearsDtoFixture.newInstance()))
                .build();
    }
}