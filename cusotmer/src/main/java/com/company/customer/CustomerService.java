package com.company.customer;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public record CustomerService(CustomerRepository repository, RestTemplate template) {
    public void registration(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        //todo: check if email valid
        //todo: check if email not token
        repository.saveAndFlush(customer);
        //todo: check if fraudster
        FraudCheckResponse fraudCheck = template.getForObject(
                "http://localhost:8081/api/v1/fraud-check/{customerId}",
                FraudCheckResponse.class,
                customer.getId()
        );
        if (fraudCheck.isFraudster()){
            throw new IllegalStateException("fraudster");
        }
        //todo:send notification
    }
}
