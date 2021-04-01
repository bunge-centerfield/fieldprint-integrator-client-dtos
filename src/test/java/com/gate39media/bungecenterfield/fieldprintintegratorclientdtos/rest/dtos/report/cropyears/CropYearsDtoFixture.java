package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.cropyears;

public class CropYearsDtoFixture {

    public static CropYearsDto newInstance() {
        return CropYearsDto.builder()
                .isIrrigated(Boolean.TRUE)
                .crop("Soybeans")
                .year(2017)
                .landUse(LandUseDtoFixture.newInstance())
                .soilConservation(SoilConservationDtoFixture.newInstance())
                .soilCarbon(SoilCarbonDtoFixture.newInstance())
                .irrigationWaterUse(IrrigationWaterUseDtoFixture.newInstance())
                .energyUse(EnergyUseDtoFixture.newInstance())
                .greenhouseGas(GreenhouseGasDtoFixture.newInstance())
                .waterQuality(WaterQualityDtoFixture.newInstance())
                .biodiversity(BiodiversityDtoFixture.newInstance())
                .build();
    }
}