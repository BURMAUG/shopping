package com.burmau.shop.pepper;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

interface PepperRepository extends JpaRepository<Pepper, Long> {
    Iterable<Pepper> find();

    Optional<Pepper> findID(Long id);

    Iterable<Pepper> findBrand(String name);

    Pepper updatePepper(Pepper pepper);

    void deleteID(Long id);
}
