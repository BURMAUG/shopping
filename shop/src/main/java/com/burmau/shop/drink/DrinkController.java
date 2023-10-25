package com.burmau.shop.drink;

import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v2/drink")
class DrinkController implements Serializable {
    final DrinkService drinkService;

    DrinkController(DrinkService drinkService) {
        this.drinkService = drinkService;
    }

    @GetMapping("/")
    Iterable<Drink> getAllDrinks(){
        return drinkService.findAllDrink();
    }
    @GetMapping("/id={id}")
    Optional<Drink> findDrink(@PathVariable Long id){
        return drinkService.findById(id);
    }
    @GetMapping("/brand={name}")
    Iterable<Drink> findDrinkByBrand(@PathVariable String name){
        return drinkService.findByBrandName(name);
    }
    @GetMapping("/manufacturer={manufacturer}")
    Iterable<Drink> findDrinkBy(@PathVariable String manufacturer){
        return drinkService.findByManufacturer(manufacturer);
    }
    @PostMapping("/")
    void addADrink(Drink bread){
        drinkService.addDrink(bread);
    }
    @PutMapping("id=/{id}")
    void updateDrink(@PathVariable Long id, @RequestBody Drink bread){
        drinkService.update(id, bread);
    }
    @DeleteMapping("/id={id}")
    void deleteDrinkWithID(@PathVariable Long id){
        drinkService.deleteDrinkWithID(id);
    }

}
