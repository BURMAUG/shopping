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
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("api/v1/fruit")
@AllArgsConstructor
public class FruitController {
    private final FruitService fruitService;
    private final BookService bookService;

    @GetMapping("/")
    public Iterable<AbstractFruit> getAllFruit(){
        return fruitService.findAllFruit();
    }
    @GetMapping("/pepper")
    public Iterable<Pepper> getAllPepper(){
        return fruitService.findAllPepper();
    }
    @GetMapping("/strawberry")
    public Iterable<Strawberry> getAllStrawberry(){
        return fruitService.findAllStrawberry();
    }
    @GetMapping("/tomato")
    public Iterable<Tomato> getAllTomato(){
        return  fruitService.findAllTomato();
    }

    //POST
    @PostMapping("/pepper/")
    public void addPepper( @RequestBody Pepper pepper){
        fruitService.saveNewPepper(pepper);
    }

    @PostMapping("/strawberry/{strawberry}")
    public void addStrawberry(@PathVariable Strawberry strawberry){
        fruitService.saveNewStrawberry(strawberry);

    }
    @PostMapping("/tomato/{tomato}")
    public void addTomato(@PathVariable Tomato tomato){
        fruitService.saveNewTomato(tomato);
    }

    //patch

    //delete
    @DeleteMapping("/pepper/{id}")
    public Iterable<Pepper> deletePepperBy(@PathVariable Long id){
        return fruitService.deleteBy(id);
    }
}
