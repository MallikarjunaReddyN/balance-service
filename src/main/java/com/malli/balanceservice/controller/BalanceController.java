package com.malli.balanceservice.controller;

import com.malli.balanceservice.domain.response.ApiResponse;
import com.malli.balanceservice.domain.response.BalanceStatusResponse;
import com.malli.balanceservice.service.BalanceService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/balance")
@Tag(name = "BalanceController", description = "Balance management APIs")
public class BalanceController {

    @Autowired
    private BalanceService balanceService;

    @GetMapping("/status")
    public ApiResponse<BalanceStatusResponse> showStatus() {
        BalanceStatusResponse balanceStatusResponse = new BalanceStatusResponse("UP", "balance-service", "Malli");
        return ApiResponse.success("200", ApiResponse.Status.SUCCESS.toString(), balanceStatusResponse);
    }

}
