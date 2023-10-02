package com.burmau.shop.drink;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkRepository extends CrudRepository<Drink, Long> {
    @Query("SELECT u FROM Drink u WHERE u.brand = :name")
    Iterable<Drink> findByBrand(String name);
    @Override
    @Query("SELECT u FROM Drink u")
    Iterable<Drink> findAll();
    @Query("SELECT u.manufacturer FROM Drink u WHERE u.manufacturer = :manufacturer")
    Iterable<Drink> findAllByManufacturer(String manufacturer);
    @Query("SELECT u FROM Drink u WHERE u.manufacturer = :manufacturer")
    boolean existsByManufacturer(String manufacturer);
    @Query("SELECT u FROM Drink u WHERE u.brand = :brandName")
    boolean existsByBrand(String brandName);

}
