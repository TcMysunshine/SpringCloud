package com.chenhao.eurekaclient.controller;

import com.chenhao.eurekaclient.model.UserModel;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
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
    @ApiOperation(value="用来测试Eureka", notes = "")
    @GetMapping(value = "/hello")
    public String HelloB(){
        logger.info("Hello,eureka-client-B");
        return "Hello，this is a message from Eureka-Client-B";
    }
    @GetMapping(value = "/getUser")
    @ApiOperation(value="用来测试Eureka获取对象", notes = "")
    public UserModel getUser(){
        logger.info("获取用户信息");
        UserModel result = new UserModel("chenhao", 12);
        logger.info(result.toString());
        return result;
    }
    @GetMapping(value = "/A2B")
    public String A2B(){
        logger.info("Hello,I am consumer");
        String result = restTemplate.getForObject("http://eureka-client-B/CB/A2B", String.class);
        return result;
    }
}
