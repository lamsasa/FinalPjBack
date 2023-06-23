package com.kh.finalPrjAm.controller;

import org.springframework.web.bind.annotation.*;

@RestController //restfulAPI를 사용할 거니까
@RequestMapping("api") // get 요청을 받기위한 annotation
public class TestController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        return "Hello,Spring boot!!";
    }
    @GetMapping("/variable1/{variable}")
    public String getVariable(@PathVariable String variable) {
        return variable;
    }
    @GetMapping(value = "request1")
    public String getRequestParam(@RequestParam String user,@RequestParam String name, @RequestParam String email) {
        return user + " " + name + " " + email;
    }
}
