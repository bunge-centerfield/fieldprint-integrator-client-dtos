package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator.cropyears;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.ValueUnitDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FieldDto {
    private Double index;
    private String hsgroup;
    private ValueUnitDto omcontent;
    private Double rainVegIndex;
    private ValueUnitDto slope;
}
