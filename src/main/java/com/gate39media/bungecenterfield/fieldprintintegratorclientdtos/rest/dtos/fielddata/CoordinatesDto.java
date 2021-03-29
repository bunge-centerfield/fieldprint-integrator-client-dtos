package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.fielddata;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CoordinatesDto {
    private Double latitude;
    private Double longitude;
}
