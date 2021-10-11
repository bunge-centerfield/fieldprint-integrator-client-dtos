package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.commons;

import lombok.Getter;

@Getter
public enum FieldprintMetricType {

    LAND_USE("Land Use", "acre / bushel", 4),
    SOIL_CONSERVATION("Soil Conservation", "ton / acre / year", 1),
    SOIL_CARBON("Soil Carbon",null, 2),
    IRRIGATION_WATER("Irrigation Water", "acre_inch / bushel", 3),
    ENERGY_USE("Energy Use", "btu / bushel", 1),
    GREENHOUSE_GAS("Greenhouse Gas", "lbs_co2e / bushel", 1),
    WATER_QUALITY("Water Quality", null, 2),
    BIODIVERSITY("Biodiversity", null, 0);

    private final String title;
    private final String unit;
    private final Integer places;

    FieldprintMetricType(String title, String unit, Integer places) {
        this.title = title;
        this.unit = unit;
        this.places = places;
    }
}
