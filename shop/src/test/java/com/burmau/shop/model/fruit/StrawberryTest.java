package com.burmau.shop.model.fruit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrawberryTest {
    Fruit strawberry = new Strawberry();

    @Test
    void getFruitType() {
        assertEquals("strawberry", strawberry.getFruitType().toLowerCase());
    }

    @Test
    void getFruitPrice() {
    }

    @Test
    void getFruitDescription() {
    }
}