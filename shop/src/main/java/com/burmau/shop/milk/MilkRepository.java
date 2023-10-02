package com.burmau.shop.milk;

import com.burmau.shop.bread.Bread;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MilkRepository extends JpaRepository<Milk, Long> {
    Iterable<Bread> find();

    Optional<Bread> findID(Long id);

    Iterable<Bread> findBrand(String name);

    void deleteID(Long id);
}
