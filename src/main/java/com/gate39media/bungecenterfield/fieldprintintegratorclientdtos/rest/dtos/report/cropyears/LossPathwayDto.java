package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.cropyears;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
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
public class LossPathwayDto {
    private PathwayDto surfaceN;
    private PathwayDto subsurfaceN;
    private PathwayDto surfaceP;
    private PathwayDto subsurfaceP;
}
