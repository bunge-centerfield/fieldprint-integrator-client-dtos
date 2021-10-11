package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.benchmarks;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RawBenchmarkScoresDto {
    @JsonProperty("crop_id")
    private Integer cropId;
    private Boolean isIrrigated;
    private String state;
    private RawBenchmarkMetricsDto metrics;
    @JsonIgnore
    private Integer year;

    private RawBenchmarkScoresDto(Integer cropId, String state) {
        this.cropId = cropId;
        this.state = state;
    }

    private RawBenchmarkScoresDto(Integer cropId, Boolean isIrrigated, String state, RawBenchmarkMetricsDto metrics) {
        this.cropId = cropId;
        this.isIrrigated = isIrrigated;
        this.state = state;
        this.metrics = metrics;
    }

    public static RawBenchmarkScoresDto newInstance() {
        return new RawBenchmarkScoresDto();
    }

    public static RawBenchmarkScoresDto of(Integer cropId, String state) {
        return new RawBenchmarkScoresDto(cropId, state);
    }

    public static RawBenchmarkScoresDto of(Integer cropId, Boolean isIrrigated, String state, RawBenchmarkMetricsDto metrics) {
        return new RawBenchmarkScoresDto(cropId, isIrrigated, state, metrics);
    }
}
