package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.calculator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.ValueUnitDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RotationDto {
    @JsonProperty("crop_calibration_mode")
    private Boolean cropCalibrationMode;
    private Integer year;
    @JsonProperty("crop_id")
    private Integer cropId;
    @JsonProperty("previous_crop_residue_burned")
    private Boolean previousCropResidueBurned;
    @JsonProperty("previous_yield")
    private ValueUnitDto previousYield;
    @JsonProperty("previous_crop_id")
    private Integer previousCropId;
    @JsonProperty("alfalfa_residue_id")
    private Integer alfalfaResidueId;
    @JsonProperty("rice_residue_id")
    private Integer riceResidueId;
    @JsonProperty("predominant_rotation_practice_id")
    private Integer predominantRotationPracticeId;
    @JsonProperty("cover_crop")
    private Boolean coverCrop;
    @JsonProperty("cover_crop_species_id")
    private Integer coverCropSpecies;
    @JsonProperty("cover_crop_establish_timing_id")
    private Integer coverCropEstablishTiming;
    @JsonProperty("tillage_class_id")
    private Integer tillageClassId;
    @JsonProperty("crlmod_id")
    private Integer crlmodId;
    @JsonProperty("conservation_practice_ids")
    private List<Integer> conservationPracticeIds;
    @JsonProperty("wind_barrier")
    private Boolean windBarrier;
    @JsonProperty("tile_drainage_id")
    private Integer tileDrainageId;
    @JsonProperty("rice_water_regime_id")
    private Integer riceWaterRegimeId;
    @JsonProperty("nutrient_plan")
    private Boolean nutrientPlan;
    @JsonProperty("nutrient_4r_ids")
    private List<Integer> nutrient4rIds;
    @JsonProperty("n_carry_over")
    private ValueUnitDto nCarryOver;
    @JsonProperty("management_technique_ids")
    private List<Integer> managementTechniques;
    @JsonProperty("p_soil_test_level_id")
    private Integer pSoilTestLevel;
    @JsonProperty("p_multi_crop_application_id")
    private Integer pMultiCropApplication;
    @JsonProperty("soil_condition_id")
    private Integer soilConditionId;
    @JsonProperty("application_rate_id")
    private Integer applicationRateId;
    @JsonProperty("application_method_id")
    private Integer applicationMethodId;
    @JsonProperty("integrated_pest_management_id")
    private Integer integratedPestManagementId;
    @JsonProperty("land_conversion")
    private Boolean landConversion;
    @JsonProperty("land_conversion_type_id")
    private Integer landConversionTypeId;
    @JsonProperty("land_conversion_acres")
    private ValueUnitDto landConversionAcres;
    @JsonProperty("wildlife_habitat_ids")
    private List<Integer> wildlifeHabitatIds;
    @JsonProperty("lime_year_applied")
    private Integer limeYearApplied;
    @JsonProperty("lime_years_applicable")
    private ValueUnitDto limeYearsApplicable;
    @JsonProperty("lime_amount")
    private ValueUnitDto limeAmount;
    @JsonProperty("rice_sulfate_amt")
    private ValueUnitDto riceSulfateAmt;
    @JsonProperty("is_irrigated")
    private Boolean isIrrigated;
    @JsonProperty("irrigation_method_id")
    private Integer irrigationMethodId;
    @JsonProperty("water_source_id")
    private Integer waterSourceId;
    @JsonProperty("irrigation_water_conservation")
    private Boolean irrigationWaterConservation;
    @JsonProperty("irrigation")
    private ValueUnitDto irrigation;
    @JsonProperty("irrigation_energy")
    private Boolean irrigationEnergy;
    @JsonProperty("irrigation_energy_exact")
    private Boolean irrigationEnergyExact;
    @JsonProperty("pump_pressure_id")
    private Integer pumpPressureId;
    @JsonProperty("pumping_depth_id")
    private Integer pumpingDepthId;
    @JsonProperty("energy_source_id")
    private Integer energySourceId;
    @JsonProperty("irrigation_electric_amt")
    private ValueUnitDto irrigationElectricAmt;
    @JsonProperty("irrigation_fuel_id")
    private Integer irrigationFuelId;
    @JsonProperty("irrigation_fuel_amt")
    private ValueUnitDto irrigationFuelAmt;
    @JsonProperty("secondary_irrigation")
    private ValueUnitDto secondaryIrrigation;
    @JsonProperty("secondary_pump_pressure_id")
    private Integer secondaryPumpPressureId;
    @JsonProperty("secondary_pumping_depth_id")
    private Integer secondaryPumpingDepthId;
    @JsonProperty("secondary_energy_source_id")
    private Integer secondaryEnergySourceId;
    @JsonProperty("secondary_irrigation_electric_amt")
    private ValueUnitDto secondaryIrrigationElectricAmt;
    @JsonProperty("secondary_irrigation_fuel_id")
    private Integer secondaryIrrigationFuelId;
    @JsonProperty("secondary_irrigation_fuel_amt")
    private ValueUnitDto secondaryIrrigationFuelAmt;
    @JsonProperty("seeding_rate_id")
    private Integer seedingRateId;
    @JsonProperty("seed_treatment")
    private Boolean seedTreatment;
    @JsonProperty("rice_planting_method_id")
    private Integer ricePlantingMethodId;
    @JsonProperty("rice_cultivar_id")
    private Integer riceCultivarId;
    @JsonProperty("abandoned_harvested_acres")
    private ValueUnitDto abandonedHarvestedAcres;
    @JsonProperty("reason_id")
    private Integer reasonId;
    @JsonProperty("yield")
    private ValueUnitDto yield;
    @JsonProperty("est_non_irrigated_yield")
    private ValueUnitDto estNonIrrigatedYield;
    @JsonProperty("alfalfa_establishment_year")
    private Integer alfalfaEstablishmentYear;
    @JsonProperty("alfalfa_expected_stand_life")
    private ValueUnitDto alfalfaExpectedStandLife;
    @JsonProperty("rice_ratoon_crop")
    private Boolean riceRatoonCrop;
    @JsonProperty("rice_yield_calc_method_id")
    private Integer riceYieldCalcMethodId;
    @JsonProperty("rice_avg_harvest_moisture")
    private ValueUnitDto riceAvgHarvestMoisture;
    @JsonProperty("beets_perct_sugar")
    private ValueUnitDto beetsPerctSugar;
    @JsonProperty("peanuts_initial_moisture")
    private ValueUnitDto peanutsInitialMoisture;
    @JsonProperty("field_to_pos_distance")
    private ValueUnitDto fieldToPosDistance;
    @JsonProperty("trans_fuel_type_id")
    private Integer transFuelTypeId;
    @JsonProperty("trans_back_haul")
    private Boolean transBackHaul;
    @JsonProperty("cotton_moisture_id")
    private Integer cottonMoistureId;
    @JsonProperty("drying_systems_id")
    private Integer dryingSystemsId;
    @JsonProperty("drying_energy_source_id")
    private Integer dryingEnergySourceId;
    @JsonProperty("drying_electric_amt")
    private ValueUnitDto dryingElectricAmt;
    @JsonProperty("drying_fuel_id")
    private Integer dryingFuelId;
    @JsonProperty("drying_fuel_amt")
    private ValueUnitDto dryingFuelAmt;
    @JsonProperty("crop_level_moisture_diff")
    private ValueUnitDto cropLevelMoistureDiff;
    @JsonProperty("applicationTrips")
    private List<ApplicationTripDto> applicationTrips;
    @JsonProperty("manureApps")
    private List<ManureAppDto> manureApps;
}
