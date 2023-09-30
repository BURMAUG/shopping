package com.burmau.shop.drink;

import org.springframework.stereotype.Service;

import java.util.IllegalFormatCodePointException;
import java.util.Optional;

@Service
class DrinkService {
    private final DrinkRepository drinkRepository;

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
            throw new DrinkNotFoundException("Drink with the following ID was not found: ");
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
}
