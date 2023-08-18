package com.burmau.shop.controller;

import com.burmau.shop.model.fruit.Fruit;
import com.burmau.shop.model.fruit.Pepper;
import com.burmau.shop.service.FruitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/fruit")
@AllArgsConstructor
public class FruitController {
    private final FruitService fruitService;

    @GetMapping("/")
    public Iterable<Fruit> getAllFruit(){
        return fruitService.findAllFruit();
    }
}
