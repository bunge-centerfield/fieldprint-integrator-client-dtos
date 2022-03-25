package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.cropyear;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FTMCropYearDto {
    private Long id;
    private Long crop;
    private Long field;
    private String year;
    private LocalDateTime createdAt;
    private LocalDateTime lastModified;
    private FTMCropYearRotationDto rotation;
    private FTMCropYearManagementDto management;
    private FTMCropYearOperationsDto operations;
    private FTMCropYearCalculatorReportDto report;

    public FTMCropYearDto(Long field) {
        this.field = field;
    }

    public FTMCropYearDto(Long field, Long crop) {
        this.crop = crop;
        this.field = field;
    }

    public FTMCropYearDto(Long field, Long crop, String year) {
        this.crop = crop;
        this.year = year;
        this.field = field;
    }

    public static FTMCropYearDto fromField(final Long field) {
        final FTMCropYearDto cropyear = new FTMCropYearDto(field);
        cropyear.init();
        return cropyear;
    }

    public static FTMCropYearDto fromFieldAndYear(final Long field, final String year) {
        final FTMCropYearDto cropyear = new FTMCropYearDto(field);
        cropyear.setYear(year);
        cropyear.init();
        return cropyear;
    }

    public static FTMCropYearDto fromFieldAndCrop(final Long field, final Long crop) {
        final FTMCropYearDto cropyear = new FTMCropYearDto(field, crop);
        cropyear.init();
        return cropyear;
    }

    public static FTMCropYearDto fromFieldAndCropAndYear(final Long field, final Long crop, final String year) {
        final FTMCropYearDto cropyear = new FTMCropYearDto(field, crop, year);
        cropyear.init();
        return cropyear;
    }

    public void init() {
        this.createdAt = LocalDateTime.now();
        this.rotation   = FTMCropYearRotationDto.newInstance();
        this.management = FTMCropYearManagementDto.newInstance();
        this.operations = FTMCropYearOperationsDto.newInstance();
    }

    public void finish() {
        this.lastModified = LocalDateTime.now();
    }
}
