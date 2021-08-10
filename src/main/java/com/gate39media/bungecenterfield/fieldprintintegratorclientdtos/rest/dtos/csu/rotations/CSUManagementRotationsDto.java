package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.csu.rotations;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.csu.managements.CSUManagementRotationManagementDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CSUManagementRotationsDto {
    private Integer duration;
    private List<CSUManagementRotationManagementDto> managements;
}
