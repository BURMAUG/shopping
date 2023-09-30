package com.burmau.shop.drink;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/drinks")
class DrinkController {
    private final DrinkService drinkService;

    DrinkController(DrinkService drinkService) {
        this.drinkService = drinkService;
    }

    @GetMapping("/")
    Iterable<Drink> getAllDrinks(){
        return drinkService.findAllDrink();
    }
}
