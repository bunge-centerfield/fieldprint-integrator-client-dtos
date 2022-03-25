package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.cropyear;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FTMCropYearCRLMODTemplatesInformationDto {
    private Long id;
    private String day;
    private String operationName;
    private String crop;
    private String residue;
    private Integer residueAmount;

    private FTMCropYearCRLMODTemplatesInformationDto(String day, String operationName, String crop, String residue, Integer residueAmount) {
        this.day = day;
        this.operationName = operationName;
        this.crop = crop;
        this.residue = residue;
        this.residueAmount = residueAmount;
    }

    public static FTMCropYearCRLMODTemplatesInformationDto of(String day, String operationName, String crop, String residue, Integer residueAmount) {
        return new FTMCropYearCRLMODTemplatesInformationDto(day, operationName, crop, residue, residueAmount);
    }
}
