package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.cropyear;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FTMCropYearManagementInformationDto {
    private Boolean fieldIrrigated;
    private Boolean windBarrier;
    private String tileDrainage;

    public static FTMCropYearManagementInformationDto newInstance() {
        return new FTMCropYearManagementInformationDto();
    }

    public static FTMCropYearManagementInformationDto of(Boolean fieldIrrigated, Boolean windBarrier, String tileDrainage) {
        return new FTMCropYearManagementInformationDto(fieldIrrigated, windBarrier, tileDrainage);
    }
}
