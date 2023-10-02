package com.burmau.shop.drink;

import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v2/drink")
class DrinkController implements Serializable {
    private final DrinkService drinkService;

    DrinkController(DrinkService drinkService) {
        this.drinkService = drinkService;
    }

    @GetMapping("/")
    Iterable<Bread> getAllDrinks(){
        return drinkService.findAllDrink();
    }
    @GetMapping("/id={id}")
    Optional<Bread> findDrink(@PathVariable Long id){
        return drinkService.findById(id);
    }
    @GetMapping("/brand={name}")
    Iterable<Bread> findDrinkByBrand(@PathVariable String name){
        return drinkService.findByBrandName(name);
    }
    @GetMapping("/manufacturer={manufacturer}")
    Iterable<Bread> findDrinkBy(@PathVariable String manufacturer){
        return drinkService.findByManufacturer(manufacturer);
    }
    @PostMapping("/")
    void addADrink(Bread bread){
        drinkService.addDrink(bread);
    }
    @PutMapping("id=/{id}")
    Bread updateDrink(@PathVariable Long id, @RequestBody Bread bread){
        return drinkService.update(id, bread);
    }
    @DeleteMapping("/id={id}")
    void deleteDrinkWithID(@PathVariable Long id){
        drinkService.deleteDrinkWithID(id);
    }

}
