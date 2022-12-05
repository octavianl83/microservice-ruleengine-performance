package com.logicore.rest.services.serviceprocessormonolit;

import com.logicore.rest.services.serviceprocessormonolit.payment.PaymentMessage;
import com.msi.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ServiceProcessorMonolitController {

    @Autowired
    private RuleEngineProxy ruleEngineProxy;

    @PostMapping("/service-process")
    public ServiceProcessedMonolit processService(@RequestBody PaymentMessage paymentMessage) {

        Product product = ruleEngineProxy.getDiscount("gold", 32);
        Product product1 = ruleEngineProxy.getDiscount("gold", 32);
        Product product2 = ruleEngineProxy.getDiscount("gold", 32);
        Product product3 = ruleEngineProxy.getDiscount("gold", 32);

        return new ServiceProcessedMonolit(1, true);
    }

}
