package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.cropyear;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FTMCropYearLandConservationDto {
    private Boolean landConversion;
    private String landConversionType;
    private String landConversionAcres;
    private String wildlifeHabitat;

    public static FTMCropYearLandConservationDto newInstance() {
        return new FTMCropYearLandConservationDto();
    }

    public static FTMCropYearLandConservationDto of(Boolean landConversion, String landConversionType, String landConversionAcres, String wildlifeHabitat) {
        return new FTMCropYearLandConservationDto(landConversion, landConversionType, landConversionAcres, wildlifeHabitat);
    }
}
