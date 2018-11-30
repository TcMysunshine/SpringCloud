package com.chenhao.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class HelloController {
    @GetMapping(value = "/hello")
    public String HelloB(){
        Logger.getLogger("eureka-client-B").info("Hello,eureka-client-B");
        return "Hello，this is a message from Eureka-Client-B";
    }
}
