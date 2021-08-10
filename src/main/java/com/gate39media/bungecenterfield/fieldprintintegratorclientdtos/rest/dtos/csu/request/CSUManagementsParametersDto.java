package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.csu.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CSUManagementsParametersDto {
    private String name;
    private String value;

    public static CSUManagementsParametersDto of(final String name, final String value) {
        return new CSUManagementsParametersDto(name, value);
    }
}
