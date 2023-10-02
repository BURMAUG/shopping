package com.burmau.shop.drink;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkRepository extends CrudRepository<Bread, Long> {
    @Query("SELECT u FROM Bread u WHERE u.brand = :name")
    Iterable<Bread> findByBrand(String name);
    @Override
    @Query("SELECT u FROM Bread u")
    Iterable<Bread> findAll();
    @Query("SELECT u.manufacturer FROM Bread u WHERE u.manufacturer = :manufacturer")
    Iterable<Bread> findAllByManufacturer(String manufacturer);
    @Query("SELECT u FROM Bread u WHERE u.manufacturer = :manufacturer")
    boolean existsByManufacturer(String manufacturer);
    @Query("SELECT u FROM Bread u WHERE u.brand = :brandName")
    boolean existsByBrand(String brandName);

}
