package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/study")
public class StudyController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "大家好，才是真的好！！！";
    }
}
