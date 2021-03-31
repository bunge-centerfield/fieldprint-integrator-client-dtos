package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ValueUnitDto {
    private Double value;
    private String unit;
    private String index;
}
