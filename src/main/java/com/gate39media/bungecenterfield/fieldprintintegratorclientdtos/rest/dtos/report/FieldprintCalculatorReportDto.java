package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.cropyears.CropYearsDto;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.metadata.MetadataDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldprintCalculatorReportDto {
    private MetadataDto metadata;
    private List<CropYearsDto> cropyears;
}
