package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.cropyear;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FTMCropYearOperationsDto {
    private FTMCropYearPlantingDto planting;
    private FTMCropYearIrrigationDto irrigation;
    private FTMCropYearHarvestingDto harvesting;
    private FTMCropYearFertilizerDto fertilizer;

    public static FTMCropYearOperationsDto of(FTMCropYearPlantingDto planting, FTMCropYearIrrigationDto irrigation, FTMCropYearHarvestingDto harvesting, FTMCropYearFertilizerDto fertilizer) {
        return new FTMCropYearOperationsDto(planting, irrigation, harvesting, fertilizer);
    }

    public static FTMCropYearOperationsDto newInstance() {
        FTMCropYearOperationsDto operations = new FTMCropYearOperationsDto();
        operations.planting   = FTMCropYearPlantingDto.newInstance();
        operations.irrigation = FTMCropYearIrrigationDto.newInstance();
        operations.harvesting = FTMCropYearHarvestingDto.newInstance();
        operations.fertilizer = FTMCropYearFertilizerDto.newInstance();
        return operations;
    }
}
