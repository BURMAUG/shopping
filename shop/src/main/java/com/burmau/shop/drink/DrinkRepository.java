package com.burmau.shop.drink;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface DrinkRepository extends CrudRepository<Drink, Long> {
    @Query("SELECT u FROM Drink u WHERE u.brand = :name")
    Iterable<Drink> findByBrand(String name);
    @Override
    @Query("SELECT u FROM Drink u")
    Iterable<Drink> findAll();
    @Query("SELECT u FROM Drink u WHERE u.manufacturer = :manufacturer")
    Iterable<Drink> findAllByManufacturer(String manufacturer);
    boolean existsByManufacturer(String manufacturer);
    boolean existsByBrand(String brandName);

}
