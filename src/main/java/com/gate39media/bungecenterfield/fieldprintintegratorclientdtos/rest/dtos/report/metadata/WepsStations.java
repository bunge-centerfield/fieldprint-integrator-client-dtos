package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.metadata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WepsStations {
    private String cliStation;
    private String windStation;
    private List<WindStations> windStations;
}
