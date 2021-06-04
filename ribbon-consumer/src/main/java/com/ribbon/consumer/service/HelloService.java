package com.ribbon.consumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author junlin_huang
 * @create 2021-06-02 10:00 PM
 **/

@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

//    @HystrixCommand(fallbackMethod="helloFallback")
    public String helloService() {
        return restTemplate.getForEntity("http://hello-service/hello",String.class).getBody();
    }

    public String helloFallback() {
        return "error";
    }
}