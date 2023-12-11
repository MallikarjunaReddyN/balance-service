package com.malli.balanceservice.domain.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public record BalanceStatusResponse(String status, @JsonProperty("service_name") String serviceName, @JsonProperty("created_by") String createdBy) {
}
