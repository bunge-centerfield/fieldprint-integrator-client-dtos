package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.csu.results;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.csu.rotations.CSUManagementRotationFilesDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CSUManagementResultValuesDto {
    private List<CSUManagementRotationFilesDto> rotationFiles;
    private Integer rotationFileCount;
    private Integer operationCount;
    private Integer cropCount;
    private Integer residueCount;
    private Integer barriersCount;
    private Integer contoursCount;
    private Integer fuelsCount;
    private Integer stripsCount;
    private Integer permeableBarrierCount;
    private Integer hydraulicElementSystemCount;
}
