package com.burmau.shop.strawberry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

interface StrawberryRepository extends JpaRepository<Strawberry, Long> {
    @Query("DELETE FROM Strawberry u WHERE u.strawberryID = :id ")
    void deleteID(Long id);
    @Query("SELECT u FROM Strawberry u WHERE u.strawberryID = :id ")
    Optional<Strawberry> findID(Long id);
    @Query("SELECT u FROM Strawberry u")
    Iterable<Strawberry> find();
}
