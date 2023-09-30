package com.burmau.shop.drink;

import org.springframework.data.repository.CrudRepository;


public interface DrinkRepository extends CrudRepository<Drink, Long> {
    Iterable<Drink> findByBrand(String name);
    Iterable<Drink> findAllByManufacturer(String manufacturer);
    boolean existsByManufacturer(String manufacturer);
    boolean existsByBrand(String brandName);

}
