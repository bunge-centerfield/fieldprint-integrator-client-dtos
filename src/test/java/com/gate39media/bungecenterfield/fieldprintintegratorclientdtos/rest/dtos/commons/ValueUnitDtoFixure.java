package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons;

public class ValueUnitDtoFixure {

    public static ValueUnitDto newInstance() {
        return ValueUnitDto.builder().value(42.5).unit("%").build();
    }

    public static ValueUnitDto fromUnitAndValue(String unit, Double value) {
        return ValueUnitDto.builder().unit(unit).value(value).build();
    }


    public static ValueUnitDto fromIndexAndValue(String index, Double value) {
        return ValueUnitDto.builder().unit(index).value(value).build();
    }
}