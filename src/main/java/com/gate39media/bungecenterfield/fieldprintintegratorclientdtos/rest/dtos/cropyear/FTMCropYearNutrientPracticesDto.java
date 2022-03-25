package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.cropyear;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FTMCropYearNutrientPracticesDto {
    private Boolean nutrientPlan;
    private String nutrient4rs;
    private Boolean limeCrop;
    private String limeYearApplied;
    private String limeYearApplicable;
    private String limeProductAmount;
    private Boolean applySulfate;
    private String sulfateProductAmount;
    private Boolean fertilizerCropYear;
    private Boolean nitrogenApplied;
    private String nCarryOver;
    private String nManagementTechniques;
    private Boolean phosphorusApplied;
    private String phosphorusYears;
    private String pManagementTechniques;
    private String phosphorusLevel;
    private String phosphorusExcessiveTechniques;

    public static FTMCropYearNutrientPracticesDto newInstance() {
        return new FTMCropYearNutrientPracticesDto();
    }
}
