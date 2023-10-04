package com.burmau.shop.bread;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface BreadRepository extends JpaRepository<Bread, Long> {
    @Query("SELECT u FROM Bread u")
    Iterable<Bread> find();
    @Query("SELECT u FROM Bread u WHERE u.breadID = :id")
    Optional<Bread> findID(Long id);
    @Query("SELECT u FROM Bread u WHERE u.brand = :name")
    Iterable<Bread> findBrand(String name);
    boolean existsByBrand(String name);
}
