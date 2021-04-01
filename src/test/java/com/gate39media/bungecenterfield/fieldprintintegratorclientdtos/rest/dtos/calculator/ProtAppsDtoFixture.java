package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator;

public class ProtAppsDtoFixture {

    public static ProtAppsDto newInstance() {
        return ProtAppsDto.builder()
                .herbicideApps(0)
                .insecticideApps(0)
                .fungicideApps(0)
                .growthRegApps(0)
                .fumigantApps(0)
                .build();
    }
}