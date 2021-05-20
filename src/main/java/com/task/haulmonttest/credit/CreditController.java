package com.task.haulmonttest.credit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("credits")
public class CreditController {

    @GetMapping
    public String creditListPage(){
        return "credit_list";
    }
}
