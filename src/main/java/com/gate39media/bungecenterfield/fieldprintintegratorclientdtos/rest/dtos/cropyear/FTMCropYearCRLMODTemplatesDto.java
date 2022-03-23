package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.cropyear;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class FTMCropYearCRLMODTemplatesDto {
    private Long id;
    private String code;
    private String name;
    private String duration;
    private String path;
    private List<FTMCropYearCRLMODTemplatesInformationDto> information;
    private Boolean active = true;

    public static FTMCropYearCRLMODTemplatesDto newInstance() {
        return new FTMCropYearCRLMODTemplatesDto();
    }
}
