package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplicationTripDto {
    @JsonProperty("fertilizer_app_timing_id")
    private Integer fertAppTiming;
    @JsonProperty("fertilizer_app_method_id")
    private Integer fertAppMethod;
    @JsonProperty("fertApps")
    private List<FertAppsDto> fertApps;
    @JsonProperty("protApps")
    private List<ProtAppsDto> protApps;
}
