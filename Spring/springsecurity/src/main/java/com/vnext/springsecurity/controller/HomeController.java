package com.vnext.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/","/home"})
    public String home(){
        return "home";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

}
