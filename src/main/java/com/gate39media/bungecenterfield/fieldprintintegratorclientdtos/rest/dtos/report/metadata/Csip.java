package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.metadata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Csip {
    private String cliGen;
    private String soils;
    private String stepMitigation;
    private String stepThresholds;
    private String wepp;
    private String weps;
    private String wepsRegion;
    private WepsStations wepsStations;
}
