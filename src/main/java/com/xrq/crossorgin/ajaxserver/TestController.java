package com.xrq.crossorgin.ajaxserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/get1")
    public RestBean get1()
    {
        System.out.println("TestController get1");
        return new RestBean("get1 ok");
    }

}
