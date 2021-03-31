package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator.cropyears;

import java.util.Arrays;

public class ConservationDtoFixture {

    public static ConservationDto newInstance() {
        final PracticesDto practice1 = PracticesDtoFixture.fromMethod("Sediment basins");
        final PracticesDto practice2 = PracticesDtoFixture.fromMethod("Riparian forest buffer");
        return ConservationDto.builder()
                .practices(Arrays.asList(practice1, practice2))
                .build();
    }
}