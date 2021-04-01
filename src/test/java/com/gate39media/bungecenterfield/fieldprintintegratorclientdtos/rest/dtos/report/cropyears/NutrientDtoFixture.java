package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.cropyears;

public class NutrientDtoFixture {

    public static NutrientDto newInstance() {
        return NutrientDto.builder()
                .index(5.75)
                .adjustedIndex(5.25)
                .appMethod("Surface Banded")
                .appRate("University/extension recommendation")
                .soilCondition("Dry/Well Drained")
                .build();
    }
}