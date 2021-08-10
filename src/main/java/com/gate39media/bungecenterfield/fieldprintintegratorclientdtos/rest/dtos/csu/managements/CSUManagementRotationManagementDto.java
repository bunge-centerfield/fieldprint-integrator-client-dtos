package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.csu.managements;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.csu.events.CSUManagementRotationEventsDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CSUManagementRotationManagementDto {
    private String id;
    private String name;
    private String path;
    private String stir;
    private List<CSUManagementRotationEventsDto> events;
}
