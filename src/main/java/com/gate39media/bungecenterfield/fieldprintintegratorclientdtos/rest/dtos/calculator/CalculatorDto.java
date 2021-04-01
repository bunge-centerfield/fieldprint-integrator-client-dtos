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
public class CalculatorDto {
    @JsonProperty("geometry_type")
    private String geometryType;
    @JsonProperty("rotation_type")
    private String rotationType;
    @JsonProperty("custom_fertilizer_type")
    private String customFertilizerType;
    @JsonProperty("generate_report")
    private Boolean generateReport;
    @JsonProperty("generated_for")
    private String generatedFor;
    private String location;
    private String grower;
    private String field;
    @JsonProperty("qdmp_request_id")
    private String qdmpRequestId;
    private JsonDto json;
}
