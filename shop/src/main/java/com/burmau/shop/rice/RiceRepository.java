package com.burmau.shop.rice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

interface RiceRepository extends JpaRepository<Rice, Long> {
    @Query("DELETE FROM Rice u WHERE u.riceID = :id")
    void deleteID(Long id);
    @Query("SELECT u FROM Rice u WHERE u.riceID = :id")
    Optional<Rice> findID(Long id);
    @Query("SELECT u FROM Rice u ")
    Iterable<Rice> find();
}