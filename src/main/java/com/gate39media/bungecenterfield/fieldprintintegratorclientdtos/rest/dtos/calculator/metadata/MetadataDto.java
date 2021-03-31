package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator.metadata;

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
public class MetadataDto {

    @Data
    static class VersionDto {
        private String api;
    }

    private Integer runTimeSec;
    private Integer boundaryAcres;
    private String state;
    @JsonProperty("generated_for")
    private String generatedFor;
    private String location;
    private String grower;
    private String field;
    @JsonProperty("qdmp_request_id")
    private String qdmpRequestId;
    private VersionDto version;
}
