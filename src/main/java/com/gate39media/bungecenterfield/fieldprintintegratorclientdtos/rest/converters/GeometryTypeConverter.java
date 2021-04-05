package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.converters;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator.enums.GeometryType;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class GeometryTypeConverter implements Converter<String, GeometryType> {

    @Override
    public GeometryType convert(String source) {
        return GeometryType.of(source);
    }
}
