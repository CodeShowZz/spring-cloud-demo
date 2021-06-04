package com.ribbon.consumer.controller;

import com.ribbon.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author junlin_huang
 * @create 2021-06-02 9:52 PM
 **/

@RestController
public class ConsumerController {


    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/ribbon-consumer",method = RequestMethod.GET)
    public String helloConsumer() {
       return helloService.helloService();
    }

}