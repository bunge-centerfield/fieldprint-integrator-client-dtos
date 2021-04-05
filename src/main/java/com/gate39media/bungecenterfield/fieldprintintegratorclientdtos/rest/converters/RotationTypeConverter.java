package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.converters;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator.enums.RotationType;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class RotationTypeConverter implements Converter<String, RotationType> {

    @Override
    public RotationType convert(String source) {
        return RotationType.of(source);
    }
}
