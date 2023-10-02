package com.burmau.shop.bread;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface BreadRepository extends JpaRepository<Bread, Long> {
    @Query("")
    Iterable<Bread> find();

    @Query("")
    Optional<Bread> findID(Long id);

    boolean existsByBrand(String name);

    Iterable<Bread> findBrand(String name);
}
