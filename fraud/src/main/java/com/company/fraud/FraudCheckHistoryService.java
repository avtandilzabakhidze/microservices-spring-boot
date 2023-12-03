package com.company.fraud;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@Service
public class FraudCheckHistoryService {
  private final FraudCheckHistoryRepository repository;

    public FraudCheckHistoryService(FraudCheckHistoryRepository repository) {
        this.repository = repository;
    }

    public boolean isFraudulentCustomer(Integer customerId){
        repository.save(
            FraudCheckHistory.builder()
                    .customerId(customerId)
                    .isFraudster(false)
                    .createdAt(LocalDateTime.now())
                    .build()
        );
        return false;
    }
}
