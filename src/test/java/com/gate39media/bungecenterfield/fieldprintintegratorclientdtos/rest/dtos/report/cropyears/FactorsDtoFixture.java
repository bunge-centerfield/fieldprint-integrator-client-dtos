package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.cropyears;

public class FactorsDtoFixture {

    public static FactorsDto newInstance() {
        return FactorsDto.builder()
                .index(4.734375)
                .adjustedIndex(4.734375)
                .field(FieldDtoFixture.newInstance())
                .tile(TileDtoFixture.newInstance())
                .nutrient(NutrientDtoFixture.newInstance())
                .pest(PestDtoFixture.newInstance())
                .tillage(TillageDtoFixture.newInstance())
                .build();
    }
}