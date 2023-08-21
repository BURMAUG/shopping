package com.burmau.shop.repository;

import com.burmau.shop.model.fruit.Tomato;
import org.springframework.data.repository.CrudRepository;

public interface TomatoRepository extends CrudRepository<Tomato, Long> {
//    void saveTomato(Tomato tomato);
}
