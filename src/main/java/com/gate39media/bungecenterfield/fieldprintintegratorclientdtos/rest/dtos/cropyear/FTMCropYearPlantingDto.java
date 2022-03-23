package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.cropyear;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FTMCropYearPlantingDto {
    private String seedingRate;
    private String plantingMethod;
    private Boolean seedTreatmentsUsed;
    private String cultivar;

    private FTMCropYearPlantingDto(String seedingRate, Boolean seedTreatmentsUsed) {
        this.seedingRate = seedingRate;
        this.seedTreatmentsUsed = seedTreatmentsUsed;
    }

    public static FTMCropYearPlantingDto newInstance() {
        return new FTMCropYearPlantingDto();
    }

    public static FTMCropYearPlantingDto of(String seedingRate, Boolean seedTreatmentsUsed) {
        return new FTMCropYearPlantingDto(seedingRate, seedTreatmentsUsed);
    }
}
