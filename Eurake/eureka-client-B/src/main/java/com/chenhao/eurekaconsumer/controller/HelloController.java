package com.chenhao.eurekaconsumer.controller;

import com.chenhao.eurekaconsumer.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@RestController
public class HelloController {
    private final static Logger logger = Logger.getLogger("eureka-client-B");
    @Autowired
    RestTemplate restTemplate;
    @GetMapping(value = "/hello")
    public String Hello(){
        logger.info("Hello,I am consumer");
        restTemplate.getForObject("http://eureka-client-A/hello", String.class);
        return "hello consumer finish !!!";
    }
    @GetMapping(value = "/getUser")
    public UserModel getUser(){
        logger.info("Hello,getUser");
        UserModel resultModel = restTemplate.getForObject("http://eureka-client-A/getUser", UserModel.class);
        return resultModel;
    }
    @GetMapping(value = "/A2B")
    public String A2B(){
        logger.info("Hello,getUser");
        return "eureka-client-B CB/A2B";
    }
//    @GetMapping(value = "/A2B")
//    public String A2B1(){
//        logger.info("Hello,chenhao");
//        return "chenhao handsome";
//    }
    @GetMapping(value = "/A2C")
    public String A2C(){
        logger.info("Hello,getUser");
        return "eureka-client-B CB/A2C";
    }
}
