package com.burmau.shop.pepper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.Optional;

interface PepperRepository extends JpaRepository<Pepper, Long> {
    @Query("SELECT u FROM  Pepper u")
    Iterable<Pepper> find();
    @Query("SELECT u FROM Pepper u WHERE u.pepperID = :id")
    Optional<Pepper> findID(Long id);
    @Query("UPDATE  Pepper p SET p.description = :description, p.price = :price where p.pepperID = :id")
    void updatePepper(Long id, String description, BigDecimal price);
    @Query("DELETE FROM Pepper u WHERE u.pepperID = :id")
    void deleteID(Long id);

}
