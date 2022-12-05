package com.logicore.rest.services.serviceprocessor1;

import com.logicore.rest.services.serviceprocessor1.payment.PaymentMessage;
import com.msi.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;

@RestController
public class ServiceProcessor1Controller {

    @Autowired
    private ServiceProcessor2Proxy proxy;

    @Autowired
    private RuleEngineProxy ruleEngineProxy;

    @PostMapping("/service-process1")
    public ServiceProcessed1 processService1(@RequestBody PaymentMessage paymentMessage) {

        Product product = ruleEngineProxy.getDiscount("gold", 32);
        ServiceProcessed1 serviceProcessed1 = proxy.retrieveProcessingStatus(paymentMessage);

        return new ServiceProcessed1(serviceProcessed1.getId(), serviceProcessed1.isProcessed());
    }

}
