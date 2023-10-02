package com.burmau.shop.drink;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
class DrinkService {
    private final DrinkRepository drinkRepository;

    DrinkService(DrinkRepository drinkRepository) {
        this.drinkRepository = drinkRepository;
    }

    Iterable<Bread> findAllDrink() {
        return drinkRepository.findAll();
    }
    Optional<Bread> findById(Long drinkID){
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
    Iterable<Bread> findByBrandName(String brandName){
        if (drinkRepository.existsByBrand(brandName))
            return drinkRepository.findByBrand(brandName);
        else
            throw new DrinkNotFoundException("Not Found");
    }
    Iterable<Bread> findByManufacturer(String manufacturer){
        if (drinkRepository.existsByManufacturer(manufacturer))
            return drinkRepository.findAllByManufacturer(manufacturer);
        else
            throw new DrinkNotFoundException("Not found.");
    }

    public Bread update(Long id, Bread bread) {
        if(drinkRepository.existsById(id)){
            return drinkRepository.save(bread);
        }
        throw new DrinkNotFoundException("Not Found");
    }

    public void addDrink(Bread bread) {
        if (drinkRepository.existsById(bread.drinkID))
            throw new DrinkNotFoundException("Already exist!");
        drinkRepository.save(bread);
    }

}
