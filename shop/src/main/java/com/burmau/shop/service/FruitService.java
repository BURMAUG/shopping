package com.burmau.shop.service;

import com.burmau.shop.model.fruit.Fruit;
import com.burmau.shop.model.fruit.Pepper;
import com.burmau.shop.model.fruit.Strawberry;
import com.burmau.shop.model.fruit.Tomato;
import lombok.Setter;

public interface FruitService {
    Iterable<Fruit> findAllFruit();
    Iterable<Pepper> findAllPepper();
    Iterable<Strawberry> findAllStrawberry();
    Iterable<Tomato> findAllTomato();
}
