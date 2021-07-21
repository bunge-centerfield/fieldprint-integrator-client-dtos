package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.ValueUnitDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ManureAppDto {
    @JsonProperty("rice_organic_fert_type_id")
    private Integer riceOrganicFertTypeId;
    @JsonProperty("manure_type_id")
    private Integer manureTypeId;
    @JsonProperty("manure_amount_id")
    private Integer manureAmountId;
    @JsonProperty("manure_app_timing_id")
    private Integer manureAppTimingId;
    @JsonProperty("manure_app_method_id")
    private Integer manureAppMethodId;
    @JsonProperty("n_applied")
    private ValueUnitDto nApplied;
    @JsonProperty("p_applied")
    private ValueUnitDto pApplied;
}
