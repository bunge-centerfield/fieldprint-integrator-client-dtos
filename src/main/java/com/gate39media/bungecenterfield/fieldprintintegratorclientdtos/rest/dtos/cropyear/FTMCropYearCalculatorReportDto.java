package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.cropyear;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.FieldprintCalculatorReportDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FTMCropYearCalculatorReportDto {
    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime lastModified;
    private FieldprintCalculatorReportDto report;

    public FTMCropYearCalculatorReportDto(FieldprintCalculatorReportDto report) {
        this.report = report;
    }

    public static FTMCropYearCalculatorReportDto fromReport(final FieldprintCalculatorReportDto report) {
        final FTMCropYearCalculatorReportDto dto = new FTMCropYearCalculatorReportDto(report);
        dto.init();
        return dto;
    }

    public void init() {
        this.createdAt = LocalDateTime.now();
    }

    public void finish() {
        this.lastModified = LocalDateTime.now();
    }
}
