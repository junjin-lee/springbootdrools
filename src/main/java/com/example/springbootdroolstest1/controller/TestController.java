package com.example.springbootdroolstest1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.springbootdroolstest1.service.DroolsService;

@RequestMapping("/test")
@Controller
public class TestController {



    @Autowired
    private DroolsService droolsService;

    @ResponseBody
    @RequestMapping("/address")
    public void test() {

        System.out.println(droolsService.fireRule());
    }
}
