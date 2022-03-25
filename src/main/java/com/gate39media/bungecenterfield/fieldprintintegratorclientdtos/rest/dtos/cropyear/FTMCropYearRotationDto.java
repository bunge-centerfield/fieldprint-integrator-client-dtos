package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.cropyear;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FTMCropYearRotationDto {
    private Boolean previousCropResidueBurned;
    private String previousCrop;
    private String previousYield;
    private String residueCovers;
    private String predominantRotationPractice;
    private Boolean coverCrop;
    private String dominantSpeciesCoverCrop;
    private String plantedCoverCrop;
    private String tillageClass;
    private FTMCropYearCRLMODTemplatesDto crlmodTemplate;

    public static FTMCropYearRotationDto newInstance() {
        return new FTMCropYearRotationDto();
    }
}
