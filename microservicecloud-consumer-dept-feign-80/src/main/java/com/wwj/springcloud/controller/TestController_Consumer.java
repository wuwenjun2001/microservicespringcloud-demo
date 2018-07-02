package com.wwj.springcloud.controller;

import com.wwj.springcloud.service.TestClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController_Consumer {
    @Autowired
    private TestClientService testClientService;

    @GetMapping("/test/get")
    public String get() {
        return testClientService.get();
    }
}
