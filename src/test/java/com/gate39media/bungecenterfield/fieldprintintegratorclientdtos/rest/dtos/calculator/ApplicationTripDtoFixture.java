package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator;

import java.util.Collections;

public class ApplicationTripDtoFixture {

    public static ApplicationTripDto newInstance() {
        return ApplicationTripDto.builder()
                .appTimeId(6)
                .fertApps(Collections.singletonList(FertAppsDtoFixture.newInstance()))
                .protApps(Collections.singletonList(ProtAppsDtoFixture.newInstance()))
                .build();
    }
}