package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.referencedata;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class ReferenceDataParamsDto {
    @NotNull
    private String param;
    public static ReferenceDataParamsDto of(final String param) {
        return new ReferenceDataParamsDto(param);
    }
}
