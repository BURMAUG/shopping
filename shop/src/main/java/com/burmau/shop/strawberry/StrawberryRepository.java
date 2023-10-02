package com.burmau.shop.strawberry;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StrawberryRepository extends JpaRepository<Strawberry, Long> {
    void deleteID(Long id);
    Iterable<Strawberry> findBrand(String name);

    Optional<Strawberry> findID(Long id);

    Iterable<Strawberry> find();
}
