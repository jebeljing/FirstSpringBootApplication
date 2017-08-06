package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jingshanyin on 7/30/17.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Das Boot, reporting for duty!";
    }
}
