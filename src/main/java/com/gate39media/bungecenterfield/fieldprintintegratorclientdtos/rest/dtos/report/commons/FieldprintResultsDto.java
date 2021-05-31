package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.commons;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.ValueUnitDto;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.cropyears.BenchmarksDto;

public interface FieldprintResultsDto {
    ValueUnitDto getFieldprintResult();
    Double getScaledFieldprintResult();
    BenchmarksDto getBenchmarks();
    FieldprintMetricType getType();
}
