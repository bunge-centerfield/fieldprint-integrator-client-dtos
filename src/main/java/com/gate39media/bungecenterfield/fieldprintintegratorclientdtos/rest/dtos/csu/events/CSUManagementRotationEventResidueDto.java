package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.csu.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CSUManagementRotationEventResidueDto {
    private String id;
    private String name;
    private String resGroup1;
    @JsonProperty("res_added")
    private String resAdded;
}
