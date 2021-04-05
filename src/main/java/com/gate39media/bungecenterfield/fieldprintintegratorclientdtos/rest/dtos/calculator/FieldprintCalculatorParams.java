package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator.enums.ArrayType;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator.enums.GeometryType;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator.enums.RotationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static java.lang.String.valueOf;
import static java.util.Optional.ofNullable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FieldprintCalculatorParams {
    private boolean validate_only;
    private boolean retry;
    private boolean strict_units;
    private boolean generate_report;
    private ArrayType array_type;
    private GeometryType geometry_type;
    private RotationType rotation_type;
    private String field;
    private String generated_for;
    private String grower;
    private String location;
    private String qdmp_request_id;

    public Map<String, String> toMap() {
        final Map<String, String> map = new HashMap<String, String>() {{
            put("validate_only", valueOf(validate_only));
            put("retry", valueOf(retry));
            put("strict_units", valueOf(strict_units));
            put("array_type", ofNullable(array_type).isPresent() ? array_type.getType() : null);
            put("geometry_type", ofNullable(geometry_type).isPresent() ? geometry_type.getType() : null);
            put("rotation_type", ofNullable(rotation_type).isPresent() ? rotation_type.getType() : null);
            put("generate_report", valueOf(generate_report));
            put("field", field);
            put("generated_for", generated_for);
            put("grower", grower);
            put("location", location);
            put("qdmp_request_id", qdmp_request_id);
        }};
        map.values().removeIf(Objects::isNull);
        return map;
    }
}
