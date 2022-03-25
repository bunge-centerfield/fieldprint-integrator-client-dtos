package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.cropyear;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FTMCropYearHarvestingDto {
    private String yield;
    private String estNonIrrigatedYield;
    private String riceYieldCalcMethod;
    private String riceAvgHarvestMoisture;
    private Boolean riceRatoonCrop;
    private Boolean abandonedHarvested;
    private String abandonedHarvestedAcres;
    private String reason;
    private String fieldToPosDistance;
    private Boolean transBackHaul;
    private String transFuelType;
    private String dryingSystem;
    private Boolean dryingSystemCalculateEnergy;
    private String dryingEnergySource;
    private String dryingElectricAmount;
    private String dryingFuelType;
    private String dryingFuelAmount;
    private String dryingMoistureRemoved;

    public static FTMCropYearHarvestingDto newInstance() {
        return new FTMCropYearHarvestingDto();
    }
}
