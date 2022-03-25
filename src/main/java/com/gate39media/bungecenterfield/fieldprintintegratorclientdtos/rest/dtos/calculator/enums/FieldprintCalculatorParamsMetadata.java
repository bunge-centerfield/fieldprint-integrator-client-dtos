package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FieldprintCalculatorParamsMetadata {
    private Long crop;
    private Long field;
    private String year;
    public static FieldprintCalculatorParamsMetadata of(final String year, final Long crop, final Long field) {
        return new FieldprintCalculatorParamsMetadata(crop, field, year);
    }
}
