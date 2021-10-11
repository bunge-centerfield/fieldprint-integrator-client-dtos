package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.benchmarks;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.ValueUnitDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RawBenchmarkMetricsDto {
    private Double biodiversity;
    private ValueUnitDto energyUse;
    private ValueUnitDto greenhouseGas;
    private ValueUnitDto irrigationWaterUse;
    private ValueUnitDto landUse;
    private ValueUnitDto soilConservation;
    private Double waterQuality;

    public static RawBenchmarkMetricsDto newInstance() {
        return new RawBenchmarkMetricsDto();
    }

    public static RawBenchmarkMetricsDto of(Double biodiversity, ValueUnitDto energyUse, ValueUnitDto greenhouseGas, ValueUnitDto irrigationWaterUse, ValueUnitDto landUse, ValueUnitDto soilConservation, Double waterQuality) {
        return new RawBenchmarkMetricsDto(biodiversity, energyUse, greenhouseGas, irrigationWaterUse, landUse, soilConservation, waterQuality);
    }
}
