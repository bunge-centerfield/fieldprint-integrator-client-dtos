package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.csu.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CSUManagementTemplateRequestDto {
    private List<CSUManagementsParametersDto> parameter;

    public String valueFromParameter(final String name) {
        return getParameter().stream().filter(param -> param.getName().equals(name)).map(CSUManagementsParametersDto::getValue).collect(Collectors.joining());
    }
}
