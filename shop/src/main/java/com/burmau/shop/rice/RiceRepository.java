package com.burmau.shop.rice;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

interface RiceRepository extends JpaRepository<Rice, Long> {
    void deleteID(Long id);

    Iterable<Rice> findBrand(String name);

    Optional<Rice> findID(Long id);

    Iterable<Rice> find();
}