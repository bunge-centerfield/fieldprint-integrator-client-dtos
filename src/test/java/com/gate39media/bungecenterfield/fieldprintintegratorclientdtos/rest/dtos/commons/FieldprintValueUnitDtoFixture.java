package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons;

public class FieldprintValueUnitDtoFixture {

    public static FieldprintValueUnitDto fromValueAndUnitAndScaledFieldprintResult(String unit, Double value, Double scaledFieldprintResult) {
        final ValueUnitDto fieldprintResult = ValueUnitDtoFixure.fromUnitAndValue(unit, value);
        return FieldprintValueUnitDto.builder().fieldprintResult(fieldprintResult).scaledFieldprintResult(scaledFieldprintResult).build();
    }

    public static FieldprintValueUnitDto fromValueAndIndexAndScaledFieldprintResult(String index, Double value, Double scaledFieldprintResult) {
        final ValueUnitDto fieldprintResult = ValueUnitDtoFixure.fromUnitAndValue(index, value);
        return FieldprintValueUnitDto.builder().fieldprintResult(fieldprintResult).scaledFieldprintResult(scaledFieldprintResult).build();
    }

    public static FieldprintValueUnitDto fromValueAndUnitAndScaledFieldprintResultAndEnergy(String unit, Double value, Double scaledFieldprintResult, String energyUnit, Double energyValue) {
        final ValueUnitDto fieldprintResult = ValueUnitDtoFixure.fromUnitAndValue(unit, value);
        final ValueUnitDto energy = ValueUnitDtoFixure.fromUnitAndValue(energyUnit, energyValue);
        return FieldprintValueUnitDto.builder().fieldprintResult(fieldprintResult)
                .scaledFieldprintResult(scaledFieldprintResult)
                .energy(energy)
                .build();
    }

    public static FieldprintValueUnitDto fromValueAndUnitAndScaledFieldprintResultAndGreenhouse(String unit, Double value, Double scaledFieldprintResult, String greenhouseUnit, Double greenHouseValue) {
        final ValueUnitDto fieldprintResult = ValueUnitDtoFixure.fromUnitAndValue(unit, value);
        final ValueUnitDto greenhouse = ValueUnitDtoFixure.fromUnitAndValue(greenhouseUnit, greenHouseValue);
        return FieldprintValueUnitDto.builder().fieldprintResult(fieldprintResult)
                .scaledFieldprintResult(scaledFieldprintResult)
                .greenhouse(greenhouse)
                .build();
    }
}