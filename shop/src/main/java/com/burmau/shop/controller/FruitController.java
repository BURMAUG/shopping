package com.burmau.shop.controller;

import com.burmau.shop.model.fruit.AbstractFruit;
import com.burmau.shop.model.fruit.Pepper;
import com.burmau.shop.model.fruit.Strawberry;
import com.burmau.shop.model.fruit.Tomato;
import com.burmau.shop.service.BookService;
import com.burmau.shop.service.FruitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fruit")
@AllArgsConstructor
public class FruitController {
    private final FruitService fruitService;
    private final BookService bookService;

    @GetMapping("/")
    public Iterable<AbstractFruit> getAllFruit(){
        return fruitService.findAllFruit();
    }
    @GetMapping("/peppers")
    public Iterable<Pepper> getAllPepper(){
        return fruitService.findAllPepper();
    }
    @GetMapping("/strawberries")
    public Iterable<Strawberry> getAllStrawberry(){
        return fruitService.findAllStrawberry();
    }
    @GetMapping("/tomatoes")
    public Iterable<Tomato> getAllTomato(){
        return  fruitService.findAllTomato();
    }

    //POST
    @PostMapping("/peppers/")
    public void addPepper( @RequestBody Pepper pepper){
        fruitService.saveNewPepper(pepper);
    }

    @PostMapping("/strawberries/")
    public void addStrawberry(@RequestBody Strawberry strawberry){
        fruitService.saveNewStrawberry(strawberry);

    }
    @PostMapping("/tomatoes/")
    public void addTomato(@RequestBody Tomato tomato){
        fruitService.saveNewTomato(tomato);
    }

    //patch

    //delete
}
