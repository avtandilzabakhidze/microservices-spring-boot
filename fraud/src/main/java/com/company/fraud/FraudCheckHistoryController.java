package com.company.fraud;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fraud-check")
@AllArgsConstructor
public class FraudCheckHistoryController {
    private final FraudCheckHistoryService service;

    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster( @PathVariable("customerId")Integer customerID){
        boolean isFraudulentCustomer = service.isFraudulentCustomer(customerID);
        return new FraudCheckResponse(isFraudulentCustomer);
    }
}
