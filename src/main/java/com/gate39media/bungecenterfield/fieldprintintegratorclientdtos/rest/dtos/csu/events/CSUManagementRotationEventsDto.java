package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.csu.events;

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
public class CSUManagementRotationEventsDto {
    private String date;
    private CSUManagementRotationEventOperationDto operation;
    private CSUManagementRotationEventCropDto crop;
    private CSUManagementRotationEventResidueDto residue;
    private Integer yield;
    @JsonProperty("res_added")
    private String resAdded;
}
