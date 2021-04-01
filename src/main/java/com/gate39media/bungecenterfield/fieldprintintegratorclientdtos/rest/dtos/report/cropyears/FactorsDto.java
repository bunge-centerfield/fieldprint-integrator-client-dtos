package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.cropyears;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FactorsDto {
    private Double index;
    private Double adjustedIndex;
    private FieldDto field;
    private TileDto tile;
    private NutrientDto nutrient;
    private PestDto pest;
    private TillageDto tillage;
}
