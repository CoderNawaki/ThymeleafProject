package com.chart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChartController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

}
