package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.benchmarks;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.cropyears.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScaledBenchmarksDto {
    private Boolean isIrrigated;
    private String crop;
    private String state;
    private BiodiversityDto biodiversity;
    private EnergyUseDto energyUse;
    private GreenhouseGasDto greenhouseGas;
    private IrrigationWaterUseDto irrigationWaterUse;
    private LandUseDto landUse;
    private SoilConservationDto soilConservation;
    private WaterQualityDto waterQuality;

    public static ScaledBenchmarksDto newInstance() {
        return new ScaledBenchmarksDto();
    }
}
