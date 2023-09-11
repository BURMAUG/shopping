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
    @PostMapping("/peppers/")
    public void addPepper( @RequestBody Pepper pepper){
        fruitService.saveNewPepper(pepper);
    }

    @PostMapping("/strawberries/{strawberry}")
    public void addStrawberry(@PathVariable Strawberry strawberry){
        fruitService.saveNewStrawberry(strawberry);

    }

    /**
     *
     * @param tomato - takes a tomato object
     */
    @PostMapping("/tomatoes/{tomato}")
    public void addTomato(@PathVariable Tomato tomato){
        fruitService.saveNewTomato(tomato);
    }

    //Update

    //delete

    //this should have a uuid if not there will be more

    /**
     *
     * @param pepperID - takes the pepperID param
     * @return fruitService
     */
    @PatchMapping("pepper/{pepperID}")
    public Pepper updatePepper(@PathVariable Long pepperID){
        return fruitService.updatePepperWith(pepperID);
    }
}
