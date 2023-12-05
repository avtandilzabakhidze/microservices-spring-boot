package com.company.fraud;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fraud-check")
@AllArgsConstructor
@Slf4j
public class FraudCheckHistoryController {
    private final FraudCheckHistoryService service;

    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerID) {
        boolean isFraudulentCustomer = service.isFraudulentCustomer(customerID);
        log.info("fraud check request for customers {}", customerID);
        return new FraudCheckResponse(isFraudulentCustomer);
    }
}
