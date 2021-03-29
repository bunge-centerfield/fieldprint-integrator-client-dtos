package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.fielddata;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GeoLocationDto {
    private String type;
    @NotNull
    @NotEmpty(message = "Coordinates cannot be empty!")
    private List<CoordinatesDto> coordinates;
}
