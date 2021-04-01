package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.cropyears;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CropYearsDto {
    private Boolean isIrrigated;
    private String crop;
    private Integer year;
    private LandUseDto landUse;
    private SoilConservationDto soilConservation;
    private SoilCarbonDto soilCarbon;
    private IrrigationWaterUseDto irrigationWaterUse;
    private EnergyUseDto energyUse;
    private GreenhouseGasDto greenhouseGas;
    private WaterQualityDto waterQuality;
    private BiodiversityDto biodiversity;
}
