package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.cropyear;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FTMCropYearIrrigationDto {
    private Boolean calculateEnergy;
    private String irrigationMethod;
    private String waterSource;
    private Boolean waterConservationMethod;
    private String waterApplied;
    private Boolean irrigationEnergy;
    private String pumpingPressure;
    private String pumpingDepth;
    private String energySource;
    private String eletricAmount;
    private String eletricFuelType;
    private String fuelAmount;
    private String secondaryWaterApplied;
    private Boolean secondaryIrrigationEnergy;
    private String secondaryPumpingPressure;
    private String secondaryPumpingDepth;
    private String secondaryEnergySource;
    private String secondaryEletricAmount;
    private String secondaryEletricFuelType;
    private String secondaryFuelAmount;

    public static FTMCropYearIrrigationDto newInstance() {
        return new FTMCropYearIrrigationDto();
    }
}
