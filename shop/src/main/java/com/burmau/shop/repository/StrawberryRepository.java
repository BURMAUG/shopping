package com.burmau.shop.repository;

import com.burmau.shop.model.fruit.Strawberry;
import org.springframework.data.repository.CrudRepository;

public interface StrawberryRepository extends CrudRepository<Strawberry, Long> {
    void saveStrawberry(Strawberry  strawberry);
}
