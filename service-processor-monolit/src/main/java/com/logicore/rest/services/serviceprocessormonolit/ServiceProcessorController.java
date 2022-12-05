package com.logicore.rest.services.serviceprocessormonolit;


import com.logicore.rest.services.serviceprocessormonolit.payment.PaymentMessage;
import com.msi.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceProcessorController {

    @Autowired
    private RuleEngineProxy proxy;

    @PostMapping("/service-process")
    public ServiceProcessed processService(@RequestBody PaymentMessage paymentMessage) {

        Product product = proxy.getDiscount("gold", 32);
        Product product1 = proxy.getDiscount("gold", 32);
        Product product2 = proxy.getDiscount("gold", 32);
        Product product3 = proxy.getDiscount("gold", 32);

        return new ServiceProcessed(1, true);
    }

}
