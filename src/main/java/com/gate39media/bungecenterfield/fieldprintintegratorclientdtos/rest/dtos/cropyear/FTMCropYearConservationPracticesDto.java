package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.cropyear;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FTMCropYearConservationPracticesDto {
    private String conservationPractices;

    public static FTMCropYearConservationPracticesDto newInstance() {
        return new FTMCropYearConservationPracticesDto();
    }

    public static FTMCropYearConservationPracticesDto of(String conservationPractices) {
        return new FTMCropYearConservationPracticesDto(conservationPractices);
    }
}
