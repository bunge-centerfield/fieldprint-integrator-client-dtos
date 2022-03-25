package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.cropyear;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FTMCropYearFertilizerApplicationRecordsDto {
    private Long id;
    private String fertilizerProductType;
    private String fertilizerProductAmount;
    private Double fertilizerN;
    private Double fertilizerP2ON;
    private Double fertilizerK2O;

    private FTMCropYearFertilizerApplicationRecordsDto(String fertilizerProductType, String fertilizerProductAmount) {
        this.fertilizerProductType = fertilizerProductType;
        this.fertilizerProductAmount = fertilizerProductAmount;
    }

    public static FTMCropYearFertilizerApplicationRecordsDto newInstance() {
        return new FTMCropYearFertilizerApplicationRecordsDto();
    }

    public static FTMCropYearFertilizerApplicationRecordsDto of(final String fertilizerProductType, final String fertilizerProductAmount) {
        return new FTMCropYearFertilizerApplicationRecordsDto(fertilizerProductType, fertilizerProductAmount);
    }
}
