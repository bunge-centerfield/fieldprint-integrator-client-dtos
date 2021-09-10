package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.metadata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class VersionDto {
    private String api;
    private Csip csip;
}