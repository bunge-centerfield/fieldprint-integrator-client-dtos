package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.fielddata;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons.ValueUnitDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SSURGO {
    private ValueUnitDto slope;
    @JsonProperty("slope_length")
    private ValueUnitDto slopeLength;
    private String texture;
    @JsonProperty("texture_id")
    private String textureId;
    private ValueUnitDto clay;
    @JsonProperty("k_factor")
    private Float kFactor;
    @JsonProperty("om_content")
    private ValueUnitDto omContent;
    @JsonProperty("hydrologic_group")
    private String hydrologicGroup;

    public static SSURGO newInstance() {
        return new SSURGO();
    }

    public void slope(ValueUnitDto slope) {
        this.slope = slope;
    }

    public void slopeLength(ValueUnitDto slopeLength) {
        this.slopeLength = slopeLength;
    }

    public void texture(String texture) {
        this.texture = texture;
    }

    public void textureId(String textureId) {
        this.textureId = textureId;
    }

    public void clay(ValueUnitDto clay) {
        this.clay = clay;
    }

    public void kfactor(Float kFactor) {
        this.kFactor = kFactor;
    }

    public void omContent(ValueUnitDto omContent) {
        this.omContent = omContent;
    }

    public void hydrologicGroup(String hydrologicGroup) {
        this.hydrologicGroup = hydrologicGroup;
    }
}
