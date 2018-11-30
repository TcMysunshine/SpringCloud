package com.chenhao.eurekaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@RestController
public class HelloController {

    @Autowired
    RestTemplate restTemplate;
    @GetMapping(value = "/hello")
    public String Hello(){
        Logger.getLogger("Hello-Consumer").info("Hello,I am consumer");
        restTemplate.getForObject("http://eureka-client-B/hello", String.class);
        return "hello consumer finish !!!";
//        return "Hello，this is a message from Eureka-Client-B";
    }
}
