package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator.cropyears;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.FieldprintValueUnitDto;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.FieldprintValueUnitDtoFixture;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.ValueUnitDtoFixure;

public class GreenhouseGasDtoFixture {

    public static GreenhouseGasDto newInstance() {
        final FieldprintValueUnitDto management = FieldprintValueUnitDtoFixture.fromValueAndUnitAndScaledFieldprintResultAndGreenhouse("lbs_co2e / bushel", 6454.211, null, "lbs_co2e / acre", 14249.354);
        final FieldprintValueUnitDto application = FieldprintValueUnitDtoFixture.fromValueAndUnitAndScaledFieldprintResultAndGreenhouse("lbs_co2e / bushel", 6454.211, null, "lbs_co2e / acre", 14249.354);
        final FieldprintValueUnitDto manureLoading = FieldprintValueUnitDtoFixture.fromValueAndUnitAndScaledFieldprintResultAndGreenhouse("lbs_co2e / bushel", 6454.211, null, "lbs_co2e / acre", 14249.354);
        final FieldprintValueUnitDto seed = FieldprintValueUnitDtoFixture.fromValueAndUnitAndScaledFieldprintResultAndGreenhouse("lbs_co2e / bushel", 6454.211, null, "lbs_co2e / acre", 14249.354);
        final FieldprintValueUnitDto irrigation = FieldprintValueUnitDtoFixture.fromValueAndUnitAndScaledFieldprintResultAndGreenhouse("lbs_co2e / bushel", 6454.211, null, "lbs_co2e / acre", 14249.354);
        final FieldprintValueUnitDto postHarvest = FieldprintValueUnitDtoFixture.fromValueAndUnitAndScaledFieldprintResultAndGreenhouse("lbs_co2e / bushel", 6454.211, null, "lbs_co2e / acre", 14249.354);
        final FieldprintValueUnitDto transportation = FieldprintValueUnitDtoFixture.fromValueAndUnitAndScaledFieldprintResultAndGreenhouse("lbs_co2e / bushel", 6454.211, null, "lbs_co2e / acre", 14249.354);
        final FieldprintValueUnitDto nitrousOxide = FieldprintValueUnitDtoFixture.fromValueAndUnitAndScaledFieldprintResultAndGreenhouse("lbs_co2e / bushel", 6454.211, null, "lbs_co2e / acre", 14249.354);
        nitrousOxide.setLrr("OTHER (OTHER), medium soil");
        final FieldprintValueUnitDto rice = FieldprintValueUnitDtoFixture.fromValueAndUnitAndScaledFieldprintResultAndGreenhouse("lbs_co2e / bushel", 6454.211, null, "lbs_co2e / acre", 14249.354);
        final FieldprintValueUnitDto residueBurning = FieldprintValueUnitDtoFixture.fromValueAndUnitAndScaledFieldprintResultAndGreenhouse("lbs_co2e / bushel", 6454.211, null, "lbs_co2e / acre", 14249.354);

        final FieldprintValueUnitDto state = FieldprintValueUnitDtoFixture.fromValueAndUnitAndScaledFieldprintResult("lbs_co2e / bushel", 0.7871854, 67.5);
        final FieldprintValueUnitDto national = FieldprintValueUnitDtoFixture.fromValueAndUnitAndScaledFieldprintResult("lbs_co2e / bushel", 0.68039155, 67.5);
        final BenchmarksDto benchmarks = BenchmarksDtoFixture.fromStateAndNationalAndScaleBasis(national, state, "State");
        return GreenhouseGasDto.builder()
                .fieldprintResult(ValueUnitDtoFixure.fromUnitAndValue("lbs_co2e / bushel", 37.958122))
                .scaledFieldprintResult(86.5)
                .totalGreenhouse(ValueUnitDtoFixure.fromUnitAndValue("lbs_co2e / acre", 2846.8591))
                .management(management)
                .application(application)
                .manureLoading(manureLoading)
                .seed(seed)
                .irrigation(irrigation)
                .postHarvest(postHarvest)
                .transportation(transportation)
                .nitrousOxide(nitrousOxide)
                .rice(rice)
                .residueBurning(residueBurning)
                .benchmarks(benchmarks)
                .build();
    }
}