package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.cropyear;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FTMCropYearFertilizerDto {
    private List<FTMCropYearFertilizerApplicationTripsDto> applicationTrips;
    private List<FTMCropYearFertilizerManureTripsDto> manureTrips;

    public static FTMCropYearFertilizerDto newInstance() {
        return new FTMCropYearFertilizerDto();
    }
}
