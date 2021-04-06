package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.referencedata;

import java.util.UUID;

public class ReferenceDataDtoFixture {

    public static ReferenceDataDto newInstance() {
        return ReferenceDataDto.builder()
                .name("Seasonal Flooding")
                .id(UUID.randomUUID().toString())
                .cropId(UUID.randomUUID().toString())
                .build();
    }
}