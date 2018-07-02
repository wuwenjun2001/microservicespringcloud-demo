package com.wwj.springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "MICROSERVICECLOUD-TEST")
public interface TestClientService {
    @RequestMapping(value = "/test/get", method = RequestMethod.GET)
    public String get();
}
