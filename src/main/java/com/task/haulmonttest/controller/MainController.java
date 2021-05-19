package com.task.haulmonttest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class MainController {

    @GetMapping("clients")
    public String clientListPage(){
        return "client_list";
    }

    @GetMapping("credits")
    public String creditListPage(){
        return "credit_list";
    }

}
