package com.chenhao.eurekaclient.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Configuration
public class MyZuulFilter extends ZuulFilter {


    @Override
    public String filterType() {
        System.out.println("pre");
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext rc = RequestContext.getCurrentContext();
        HttpServletRequest request = rc.getRequest();
        return null;
    }
}
