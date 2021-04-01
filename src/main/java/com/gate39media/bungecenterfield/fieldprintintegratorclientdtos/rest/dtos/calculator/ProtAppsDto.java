package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProtAppsDto {
    @JsonProperty("herbicide_apps")
    private Integer herbicideApps;
    @JsonProperty("insecticide_apps")
    private Integer insecticideApps;
    @JsonProperty("fungicide_apps")
    private Integer fungicideApps;
    @JsonProperty("growth_reg_apps")
    private Integer growthRegApps;
    @JsonProperty("fumigant_apps")
    private Integer fumigantApps;
}
