package com.trall.springcloud.controller;

import com.trall.springcloud.service.StreamService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MessageController {

    @Resource
    private StreamService service;

    @RequestMapping("sendMessage")
    public void sendMessage(){
        service.sendMessage();
    }
}
