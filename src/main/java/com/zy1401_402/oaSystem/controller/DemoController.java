package com.zy1401_402.oaSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class DemoController {
    @RequestMapping("")
    public String index(){
    	return "index";
    }
}