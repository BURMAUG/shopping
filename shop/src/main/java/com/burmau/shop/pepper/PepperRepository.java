package com.burmau.shop.pepper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

interface PepperRepository extends JpaRepository<Pepper, Long> {
    @Query("SELECT u FROM  Pepper u")
    Iterable<Pepper> find();
    @Query("SELECT u FROM Pepper u WHERE u.pepperID = :id")
    Optional<Pepper> findID(Long id);

//    Pepper updatePepper(Pepper pepper);
    @Query("DELETE FROM Pepper u WHERE u.pepperID = :id")
    void deleteID(Long id);
}
