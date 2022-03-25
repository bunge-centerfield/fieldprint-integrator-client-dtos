package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.cropyear;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FTMCropYearIntegratedPestManagementDto {
    private String integratedPestManagement;

    public static FTMCropYearIntegratedPestManagementDto newInstance() {
        return new FTMCropYearIntegratedPestManagementDto();
    }

    public static FTMCropYearIntegratedPestManagementDto of(String integratedPestManagement) {
        return new FTMCropYearIntegratedPestManagementDto(integratedPestManagement);
    }
}
