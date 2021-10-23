package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.referencedata;

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
public class ReferenceDataDto {
    private String id;
    private String name;
    @JsonProperty("crop_id")
    private String cropId;
    private List<String> applicability;
    private String description;
    private String purpose;
    @JsonProperty("nrcs_id")
    private String nrcsId;
    private String type;
    @JsonProperty("default_units")
    private String units;
    @JsonProperty("max_error")
    private Integer maxError;
    @JsonProperty("max_flag")
    private Integer maxFlag;
}
