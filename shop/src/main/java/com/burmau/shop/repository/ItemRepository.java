package com.burmau.shop.repository;

import com.burmau.shop.model.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
