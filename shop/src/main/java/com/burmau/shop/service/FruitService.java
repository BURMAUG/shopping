package com.burmau.shop.service;

import com.burmau.shop.model.fruit.AbstractFruit;
import com.burmau.shop.model.fruit.Pepper;
import com.burmau.shop.model.fruit.Strawberry;
import com.burmau.shop.model.fruit.Tomato;

public interface FruitService {
    Iterable<AbstractFruit> findAllFruit();
    Iterable<Pepper> findAllPepper();
    Iterable<Strawberry> findAllStrawberry();
    Iterable<Tomato> findAllTomato();

    void saveNewPepper(Pepper pepper);

    void saveNewStrawberry(Strawberry strawberry);

    void saveNewTomato(Tomato tomato);

    Iterable<Pepper> deleteBy(Long id);
}
