package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.cropyear;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FTMCropYearParamsDto {
    private String year;
    private Long crop;
    private Long field;

    public static FTMCropYearParamsDto of(final String year, final Long crop, final Long field) {
        return new FTMCropYearParamsDto(year, crop, field);
    }

    public static FTMCropYearParamsDto fromYearAndCrop(final String year, final Long crop) {
        final FTMCropYearParamsDto dto = new FTMCropYearParamsDto();
        dto.setYear(year);
        dto.setCrop(crop);
        return dto;
    }

    public static FTMCropYearParamsDto fromYearAndField(final String year, final Long field) {
        final FTMCropYearParamsDto dto = new FTMCropYearParamsDto();
        dto.setYear(year);
        dto.setField(field);
        return dto;
    }

    public Map<String, String> toMap() {
        return new HashMap<String, String>() {{
            put("year", getYear());
            put("crop", String.valueOf(getCrop()));
            put("field", String.valueOf(getField()));
        }};
    }
}
