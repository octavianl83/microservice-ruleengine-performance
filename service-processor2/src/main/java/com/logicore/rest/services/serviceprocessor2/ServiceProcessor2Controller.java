package com.logicore.rest.services.serviceprocessor2;

import com.logicore.rest.services.serviceprocessor2.payment.PaymentMessage;
import com.msi.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceProcessor2Controller {

    @Autowired
    private ServiceProcessor3Proxy proxy;

    @Autowired
    private RuleEngineProxy ruleEngineProxy;

    @PostMapping("/service-process2/")
    public ServiceProcessed2 processService2(@RequestBody PaymentMessage paymentMessage) {

        Product product = ruleEngineProxy.getDiscount("gold", 32);

        ServiceProcessed2 serviceProcessed2 = proxy.retreiveProcessingStatus(paymentMessage);

        return new ServiceProcessed2(serviceProcessed2.getId(), serviceProcessed2.isProcessed());
    }

}
