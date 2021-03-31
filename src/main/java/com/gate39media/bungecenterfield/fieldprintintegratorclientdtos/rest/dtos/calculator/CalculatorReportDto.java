package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator.cropyears.CropYearsDto;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator.metadata.MetadataDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CalculatorReportDto {
    private MetadataDto metadata;
    private List<CropYearsDto> cropyears;
}
