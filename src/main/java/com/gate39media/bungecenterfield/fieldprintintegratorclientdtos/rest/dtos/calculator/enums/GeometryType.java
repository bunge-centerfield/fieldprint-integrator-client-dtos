package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator.enums;

import lombok.Getter;

@Getter
public enum GeometryType {
    AUTO("auto"), JSON("json"), WKT("wkt");

    private String type;

    GeometryType(String type) {
        this.type = type;
    }

    public static GeometryType of(String type) {
        if (type == null) {
            return null;
        }
        for (GeometryType geometryType : GeometryType.values()) {
            if (type.equals(geometryType.getType())) {
                return geometryType;
            }
        }
        throw new IllegalArgumentException("Request param 'geometry_type' must be one of 'auto', 'json' or 'wkt'");
    }
}
