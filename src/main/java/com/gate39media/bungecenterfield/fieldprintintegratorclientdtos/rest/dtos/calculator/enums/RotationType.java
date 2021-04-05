package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator.enums;

import lombok.Getter;

@Getter
public enum RotationType {
    AUTO("auto"), TILLAGE_ID("tillage_id"), CRLMOD_ID("crlmod_id"), ROTATION_JSON("rotation_json");

    private String type;

    RotationType(String type) {
        this.type = type;
    }

    public static RotationType of(String type) {
        if (type == null) {
            return null;
        }
        for (RotationType rotationType : RotationType.values()) {
            if (type.equals(rotationType.getType())) {
                return rotationType;
            }
        }
        throw new IllegalArgumentException("Request param 'rotation_type' must be one of 'auto', 'tillage_id', 'crlmod_id' or 'rotation_json'");
    }
}
