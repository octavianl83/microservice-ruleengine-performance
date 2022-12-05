package com.logicore.rest.services.serviceprocessor3;

import com.logicore.rest.services.serviceprocessor3.payment.PaymentMessage;
import com.msi.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceProcessor3Controller {

    @Autowired
    private ServiceProcessor4Proxy proxy;

    @Autowired
    private RuleEngineProxy ruleEngineProxy;


    @PostMapping("/service-process3/")
    public ServiceProcessed3 processService2(@RequestBody PaymentMessage paymentMessage) {

        Product product = ruleEngineProxy.getDiscount("gold", 32);

        ServiceProcessed3 serviceProcessed3 = proxy.retreiveProcessingStatus(paymentMessage);

        return new ServiceProcessed3(serviceProcessed3.getId(), serviceProcessed3.isProcessed());
    }

}
