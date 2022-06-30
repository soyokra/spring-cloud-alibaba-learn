package com.soyokra.learn.order.api.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
    @GetMapping("/info")
    public String info(){
        return null;
    }
}
