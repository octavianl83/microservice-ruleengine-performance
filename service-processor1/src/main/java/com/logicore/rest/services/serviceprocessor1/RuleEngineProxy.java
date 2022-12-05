package com.logicore.rest.services.serviceprocessor1;

import com.msi.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="ruleengine")
public interface RuleEngineProxy {
    @GetMapping("/getDiscount/{type}/customerAge/{age}")
    public Product getDiscount(@PathVariable String type, @PathVariable int age);

}
