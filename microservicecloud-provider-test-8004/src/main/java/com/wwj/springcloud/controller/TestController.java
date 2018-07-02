package com.wwj.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping(value = "/test/get", method = RequestMethod.GET)
    public String get() {
        return "microservicecloud-provider-test-8004";
    }
}

