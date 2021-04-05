package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator.enums;

import lombok.Getter;

@Getter
public enum ArrayType {
    AUTO("auto"), ARRAY("array"), OBJECT("object");

    private String type;

    ArrayType(String type) {
        this.type = type;
    }

    public static ArrayType of(String type) {
        if (type == null) {
            return null;
        }
        for (ArrayType arrayType : ArrayType.values()) {
            if (type.equals(arrayType.getType())) {
                return arrayType;
            }
        }
        throw new IllegalArgumentException("Request param 'array_type' must be one of 'auto', 'array' or 'object'");
    }
}
