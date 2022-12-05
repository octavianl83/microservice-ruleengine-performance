package com.logicore.rest.services.serviceprocessor4;

import com.logicore.rest.services.serviceprocessor4.payment.PaymentMessage;
import com.msi.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceProcessor4Controller {

//    @Autowired
//    private RuleEngineProxy ruleEngineProxy;

    @PostMapping("/service-process4/")
    public ServiceProcessed4 processService4(@RequestBody PaymentMessage paymentMessage) {

//        Product product = ruleEngineProxy.getDiscount("gold", 32);

        ServiceProcessed4 serviceProcessed4 = new ServiceProcessed4(4,true);
        return serviceProcessed4;
    }

}
