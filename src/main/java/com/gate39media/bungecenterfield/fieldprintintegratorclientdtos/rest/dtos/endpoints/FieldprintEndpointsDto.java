package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.endpoints;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.deserializers.FiendprintEndpointDeserializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonDeserialize(using = FiendprintEndpointDeserializer.class)
public class FieldprintEndpointsDto {
    private List<String> endpoints;

    public static FieldprintEndpointsDto fromEndpoints(List<String> endpoints) {
        return FieldprintEndpointsDto.builder().endpoints(endpoints).build();
    }
}
