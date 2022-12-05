package com.logicore.rest.services.serviceprocessor2;

import com.logicore.rest.services.serviceprocessor2.payment.PaymentMessage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="service-processor3")
public interface ServiceProcessor3Proxy {
    @PostMapping("/service-process3/")
    public ServiceProcessed2 retreiveProcessingStatus(PaymentMessage paymentMessage);

}
