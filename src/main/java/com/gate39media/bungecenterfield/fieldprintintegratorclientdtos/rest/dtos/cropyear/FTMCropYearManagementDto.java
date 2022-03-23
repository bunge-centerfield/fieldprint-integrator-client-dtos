package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.cropyear;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FTMCropYearManagementDto {
    private FTMCropYearLandConservationDto conservation;
    private FTMCropYearManagementInformationDto information;
    private FTMCropYearNutrientPracticesDto nutrientPractices;
    private FTMCropYearConservationPracticesDto conservationPractices;
    private FTMCropYearIntegratedPestManagementDto integratedPestManagement;

    public static FTMCropYearManagementDto newInstance() {
        FTMCropYearManagementDto management = new FTMCropYearManagementDto();
        management.conservation = FTMCropYearLandConservationDto.newInstance();
        management.information = FTMCropYearManagementInformationDto.newInstance();
        management.nutrientPractices = FTMCropYearNutrientPracticesDto.newInstance();
        management.conservationPractices = FTMCropYearConservationPracticesDto.newInstance();
        management.integratedPestManagement = FTMCropYearIntegratedPestManagementDto.newInstance();
        return management;
    }

    public static FTMCropYearManagementDto of(FTMCropYearLandConservationDto conservation, FTMCropYearManagementInformationDto information, FTMCropYearNutrientPracticesDto nutrientPractices, FTMCropYearConservationPracticesDto conservationPractices, FTMCropYearIntegratedPestManagementDto integratedPestManagement) {
        return new FTMCropYearManagementDto(conservation, information, nutrientPractices, conservationPractices, integratedPestManagement);
    }
}
