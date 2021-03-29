package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos;

import org.springframework.boot.Banner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class FieldprintIntegratorClientApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(FieldprintIntegratorClientApplication.class)
                .bannerMode(Banner.Mode.OFF)
                .logStartupInfo(true)
                .web(WebApplicationType.NONE)
                .run(args);
    }
}
