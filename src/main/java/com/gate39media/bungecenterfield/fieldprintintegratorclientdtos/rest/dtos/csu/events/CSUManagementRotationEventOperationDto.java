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
public class CSUManagementRotationEventOperationDto {
    private String id;
    private String name;
    private String opGroup1;
    private String opGroup2;
    private String opGroup3;
    private String opGroup4;
    private String opGroup5;
    private Integer stir;
    @JsonProperty("begin_growth")
    private Boolean beginGrowth;
    @JsonProperty("add_residue")
    private Boolean addResidue;
    @JsonProperty("kill_crop")
    private Boolean killCrop;
    private Integer defaultResidueAdded;
}
