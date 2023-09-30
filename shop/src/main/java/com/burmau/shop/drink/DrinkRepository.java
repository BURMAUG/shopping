package com.burmau.shop.drink;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface DrinkRepository extends CrudRepository<Drink, Long> {
    boolean existsByBrand(String brandName);

    Optional<Drink> findByBrand(String name);
}
