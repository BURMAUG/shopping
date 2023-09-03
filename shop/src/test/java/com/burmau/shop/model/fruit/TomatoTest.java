package com.burmau.shop.model.fruit;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
class TomatoTest {
    private final AbstractFruit tomato = new Tomato();
    @Test
    void getFruitType() {
        assertEquals("tomato", tomato.type().toLowerCase());
    }

    @Test
    void getFruitPrice() {
        BigDecimal price = tomato.price(1.0);
        assertEquals(new BigDecimal("1.99"), price);
    }

    @Test
    void getFruitDescription() {
        assertEquals("red succulent fruit.", tomato.description().toLowerCase());
    }

    @Test
    void testToString() {
    }
}