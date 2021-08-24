package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.errors;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FieldToMarketApiError {
    private String error;
    private String trace;
}
