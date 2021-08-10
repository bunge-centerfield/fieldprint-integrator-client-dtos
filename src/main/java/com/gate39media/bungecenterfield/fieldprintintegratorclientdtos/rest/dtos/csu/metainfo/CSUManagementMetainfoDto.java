package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.csu.metainfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CSUManagementMetainfoDto {
    private String status;
    private String suid;
    @JsonProperty("cloud_node")
    private String cloudNode;
    @JsonProperty("service_url")
    private String serviceUrl;
    private String tstamp;
    @JsonProperty("cpu_time")
    private Integer cpuTime;
    @JsonProperty("expiration_date")
    private String expirationDate;
}
