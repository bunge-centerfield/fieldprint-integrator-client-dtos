package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.csu.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CSUManagementRotationEventCropDto {
    private String id;
    private String name;
    private String yield;
    private String cropGroup1;
    private String defaultYield;
    private String yieldUnit;
}
