package com.burmau.shop.drink;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
class DrinkService {
    final DrinkRepository drinkRepository;

    DrinkService(DrinkRepository drinkRepository) {
        this.drinkRepository = drinkRepository;
    }

    Iterable<Drink> findAllDrink() {
        return drinkRepository.findAll();
    }
    Optional<Drink> findById(Long drinkID){
        if (drinkRepository.existsById(drinkID))
            return drinkRepository.findById(drinkID);
        else
            throw new DrinkNotFoundException("Drink with the following ID was not found: " + drinkID);
    }
    void deleteDrinkWithID(Long drinkID){
        if (drinkRepository.existsById(drinkID))
            drinkRepository.deleteById(drinkID);
        else
            throw new DrinkNotFoundException("Not found");
    }
    Iterable<Drink> findByBrandName(String brandName){
        if (drinkRepository.existsByBrand(brandName))
            return drinkRepository.findByBrand(brandName);
        else
            throw new DrinkNotFoundException("Not Found");
    }
    Iterable<Drink> findByManufacturer(String manufacturer){
        if (drinkRepository.existsByManufacturer(manufacturer))
            return drinkRepository.findAllByManufacturer(manufacturer);
        else
            throw new DrinkNotFoundException("Not found.");
    }

     void update(Long id, Drink drink) {
        if(!drinkRepository.existsById(id))
            throw new DrinkNotFoundException("Not Found");
        drinkRepository.findById(id).ifPresent(dbdrink ->{
            dbdrink.setBrand(dbdrink.getManufacturer());
            dbdrink.setManufacturer(drink.getManufacturer());
            dbdrink.setPrice(drink.getPrice());
            drinkRepository.save(dbdrink);
        });
    }

     void addDrink(Drink drink) {
             drinkRepository.save(drink);
     }

}
