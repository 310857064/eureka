package com.tianwen.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/eureka/client")
@RestController
public class HelloController {

    @Value("${server.port}")
    private Integer port;

    @GetMapping(value = "/hello")
    public String hello() {
        return "hello..." + "i am " + port;
    }
}
