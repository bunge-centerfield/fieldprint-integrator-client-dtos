package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.csu;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.csu.metainfo.CSUManagementMetainfoDto;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.csu.request.CSUManagementsParametersDto;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.csu.results.CSUManagementResultDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CSUManagementTemplatesDto {
    private List<CSUManagementsParametersDto> parameter;
    private CSUManagementMetainfoDto metainfo;
    private List<CSUManagementResultDto> result;
}
