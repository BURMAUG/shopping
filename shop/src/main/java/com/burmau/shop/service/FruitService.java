package com.burmau.shop.service;

import com.burmau.shop.model.fruit.Fruit;
import com.burmau.shop.model.fruit.Pepper;
import lombok.Setter;

public interface FruitService {

    Iterable<Fruit> findAllFruit();
}
