package com.burmau.shop.controller;

import com.burmau.shop.service.FruitService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/fruit")
public class FruitController {
    private FruitService fruitService;

}
