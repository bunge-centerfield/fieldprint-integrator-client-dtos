package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.cropyear;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FTMCropYearFertilizerApplicationTripsDto {
    private Long id;
    private String applicationTiming;
    private String applicationMethod;
    private List<FTMCropYearFertilizerApplicationRecordsDto> fertApplicationRecords;
    private String herbicide;
    private String insecticide;
    private String fungicide;
    private String growthRegulator;
    private String fumigant;
    private String harvestAid;

    public static FTMCropYearFertilizerApplicationTripsDto newInstance() {
        return new FTMCropYearFertilizerApplicationTripsDto();
    }
}
