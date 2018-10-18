package com.yczuoxin.nacosprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @GetMapping("/demo/{string}")
    public String provider(@PathVariable String string){
        System.out.println("nacos-provider");
        return "Hello, Nacos Discovery " + string;
    }
}
