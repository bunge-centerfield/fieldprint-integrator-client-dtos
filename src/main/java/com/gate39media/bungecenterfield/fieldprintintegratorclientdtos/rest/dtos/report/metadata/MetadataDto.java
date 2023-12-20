package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.metadata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonIgnoreProperties(ignoreUnknown = true)
public class MetadataDto {
    private Double runTimeSec;
    private ValueUnitDto boundaryAcres;
    private String state;
    @JsonProperty("generated_for")
    private String generatedFor;
    private String location;
    private String grower;
    private String field;
    @JsonProperty("qdmp_request_id")
    private String qdmpRequestId;
    private VersionDto version;
    private SoilInfo soilInfo;
    @JsonProperty("report_url")
    private String reportUrl;
}
