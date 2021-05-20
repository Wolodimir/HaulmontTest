package com.task.haulmonttest.creditOffer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("creditOffers")
public class CreditOfferController {

    @GetMapping
    public String creditOffersPage(){
        return "credit_offer";
    }
}
