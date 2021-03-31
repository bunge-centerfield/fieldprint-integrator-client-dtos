package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator.cropyears;

import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.FieldprintValueUnitDto;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.FieldprintValueUnitDtoFixture;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.ValueUnitDtoFixure;

public class EnergyUseDtoFixture {

    public static EnergyUseDto newInstance() {
        final FieldprintValueUnitDto management = FieldprintValueUnitDtoFixture.fromValueAndUnitAndScaledFieldprintResultAndEnergy("btu / bushel", 6454.211, null, "btu / acre", 14249.354);
        final FieldprintValueUnitDto application = FieldprintValueUnitDtoFixture.fromValueAndUnitAndScaledFieldprintResultAndEnergy("btu / bushel", 6454.211, null, "btu / acre", 14249.354);
        final FieldprintValueUnitDto manureLoading = FieldprintValueUnitDtoFixture.fromValueAndUnitAndScaledFieldprintResultAndEnergy("btu / bushel", 6454.211, null, "btu / acre", 14249.354);
        final FieldprintValueUnitDto seed = FieldprintValueUnitDtoFixture.fromValueAndUnitAndScaledFieldprintResultAndEnergy("btu / bushel", 6454.211, null, "btu / acre", 14249.354);
        final FieldprintValueUnitDto irrigation = FieldprintValueUnitDtoFixture.fromValueAndUnitAndScaledFieldprintResultAndEnergy("btu / bushel", 6454.211, null, "btu / acre", 14249.354);
        final FieldprintValueUnitDto postHarvest = FieldprintValueUnitDtoFixture.fromValueAndUnitAndScaledFieldprintResultAndEnergy("btu / bushel", 6454.211, null, "btu / acre", 14249.354);
        final FieldprintValueUnitDto transportation = FieldprintValueUnitDtoFixture.fromValueAndUnitAndScaledFieldprintResultAndEnergy("btu / bushel", 6454.211, null, "btu / acre", 14249.354);
        final FieldprintValueUnitDto state = FieldprintValueUnitDtoFixture.fromValueAndUnitAndScaledFieldprintResult("btu / bushel", 0.7871854, 67.5);
        final FieldprintValueUnitDto national = FieldprintValueUnitDtoFixture.fromValueAndUnitAndScaledFieldprintResult("btu / bushel", 0.68039155, 67.5);
        final BenchmarksDto benchmarks = BenchmarksDtoFixture.fromStateAndNationalAndScaleBasis(national, state, "State");
        return EnergyUseDto.builder()
                .fieldprintResult(ValueUnitDtoFixure.fromUnitAndValue("btu / bushel", 58160.168))
                .scaledFieldprintResult(27.5)
                .totalEnergy(ValueUnitDtoFixure.fromUnitAndValue("btu / acre", 4362012.5))
                .management(management)
                .application(application)
                .manureLoading(manureLoading)
                .seed(seed)
                .irrigation(irrigation)
                .postHarvest(postHarvest)
                .transportation(transportation)
                .benchmarks(benchmarks)
                .build();
    }
}