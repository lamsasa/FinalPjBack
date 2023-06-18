package com.kh.finalPrjAm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //restfulAPI를 사용할 거니까
@RequestMapping("api") // get 요청을 받기위한 annotation
public class TestController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        return "Hello,Spring boot!!";
    }
}
