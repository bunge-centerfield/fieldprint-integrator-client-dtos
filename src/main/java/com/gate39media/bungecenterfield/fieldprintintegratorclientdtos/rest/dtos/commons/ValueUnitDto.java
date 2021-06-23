package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Optional;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ValueUnitDto {
    private Double value;
    private String unit;
    private String index;

    public static ValueUnitDto newInstance() {
        return new ValueUnitDto();
    }

    public static ValueUnitDto fromValueAndUnit(final Double value, final String unit) {
        final ValueUnitDto valueunit = newInstance();
        valueunit.value(value);
        valueunit.unit(unit);
        return valueunit;
    }

    public static ValueUnitDto fromValueAndIndex(final Double value, final String index) {
        final ValueUnitDto valueunit = newInstance();
        valueunit.value(value);
        valueunit.index(index);
        return valueunit;
    }

    public void value(Double value) {
        this.value = value;
    }

    public void unit(String unit) {
        this.unit = unit;
    }

    public void index(String index) {
        this.index = index;
    }

    public Float floatValue() {
        return Optional.ofNullable(value).isPresent() ? value.floatValue() : null;
    }
}
