package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.commons;

import lombok.Getter;

@Getter
public enum FieldprintMetricType {

    LAND_USE("Land Use"),
    SOIL_CONSERVATION("Soil Conservation"),
    SOIL_CARBON("Soil Carbon"),
    IRRIGATION_WATER("Irrigation Water"),
    ENERGY_USE("Energy Use"),
    GREENHOUSE_GAS("Greenhouse Gas"),
    WATER_QUALITY("Water Quality"),
    BIODIVERSITY("Biodiversity");

    private final String title;

    FieldprintMetricType(final String title) {
        this.title = title;
    }
}
