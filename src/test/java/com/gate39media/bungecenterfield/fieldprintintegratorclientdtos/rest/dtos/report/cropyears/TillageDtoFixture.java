package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.cropyears;

public class TillageDtoFixture {

    public static TillageDto newInstance() {
        return TillageDto.builder()
                .index(5)
                .adjustedIndex(5)
                .stir(60.3742218)
                .build();
    }
}