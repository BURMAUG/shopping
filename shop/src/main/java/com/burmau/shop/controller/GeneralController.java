package com.burmau.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GeneralController {
    //General Service
    //Repository too needed
    @GetMapping
    public Iterable<Object> storeItems(){
        return null;
    }

}
