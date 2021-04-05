package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.converters;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator.enums.ArrayType;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ArrayTypeConverter implements Converter<String, ArrayType> {

    @Override
    public ArrayType convert(String source) {
        return ArrayType.of(source);
    }
}
