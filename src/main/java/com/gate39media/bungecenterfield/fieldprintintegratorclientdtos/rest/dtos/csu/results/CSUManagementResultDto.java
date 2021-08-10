package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.csu.results;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CSUManagementResultDto {
    private String name;
    private CSUManagementResultValuesDto value;
}
