package com.zxd8813.earthquake.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class SearchController {
    @RequestMapping("/searchDay")
    public String searchDay(){
        return "searchDay";
    }
}
