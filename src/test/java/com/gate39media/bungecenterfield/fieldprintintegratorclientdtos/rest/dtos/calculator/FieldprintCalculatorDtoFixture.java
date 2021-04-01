package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator;

public class FieldprintCalculatorDtoFixture {

    public static FieldprintCalculatorDto newInstance() {
        return FieldprintCalculatorDto.builder()
                .geometryType("geojson")
                .rotationType("crlmod_id")
                .customFertilizerType("json")
                .generateReport(true)
                .generatedFor("Generated for #1")
                .location("Location #1")
                .grower("Grower #1")
                .field("Field #1")
                .qdmpRequestId("Insert string")
                .json(JsonDtoFixture.newInstance())
                .build();
    }
}