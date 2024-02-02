package com.burmau.shop.milk;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface MilkRepository extends JpaRepository<Milk, Long> {
    @Query("SELECT u FROM Milk u")
    Iterable<Milk> find();
    @Query("SELECT u FROM Milk  u WHERE u.id = :id")
    Optional<Milk> findID(Long id);
    @Query("SELECT u FROM Milk u WHERE u.brand = :name")
    Iterable<Milk> findBrand(String name);
    @Query("DELETE FROM Milk u WHERE u.id = :id")
    void deleteID(Long id);
}
