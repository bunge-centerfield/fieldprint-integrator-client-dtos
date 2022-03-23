package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.cropyear;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FTMCropYearFertilizerManureTripsDto {
    private Long id;
    private String fertilizerType;
    private String fertilizerAmount;
    private String fertilizerApplicationTiming;
    private String fertilizerApplicationMethod;
    private String poundsOfNAcre;
    private String poundsOfPAcre;

    public static FTMCropYearFertilizerManureTripsDto newInstance() {
        return new FTMCropYearFertilizerManureTripsDto();
    }

    public static FTMCropYearFertilizerManureTripsDto fromFertlizerType(final String fertilizerType) {
        final FTMCropYearFertilizerManureTripsDto manureTrip = newInstance();
        manureTrip.setFertilizerType(fertilizerType);
        return manureTrip;
    }
}
