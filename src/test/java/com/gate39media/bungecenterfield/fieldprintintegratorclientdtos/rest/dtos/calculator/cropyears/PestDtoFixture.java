package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator.cropyears;

public class PestDtoFixture {

    public static PestDto newInstance() {
        return PestDto.builder()
                .index(2)
                .adjustedIndex(2)
                .method("Pests managed primarily using chemical control")
                .build();
    }
}