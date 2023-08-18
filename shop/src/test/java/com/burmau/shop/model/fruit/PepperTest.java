package com.burmau.shop.model.fruit;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PepperTest {
    Fruit pepper = new Pepper();
    @Test
    void getFruitType() {
        assertEquals("Pepper", pepper.getFruitType());
    }

    @Test
    void getFruitPrice() {
        BigDecimal p = pepper.getFruitPrice(.2);
        assertEquals(new BigDecimal("0.06"), p);
    }


    @Test
    void getFruitDescription() {
        String value = pepper.getFruitDescription();
        assertEquals("Hot and spicy pepper put with care!".toLowerCase(), value.toLowerCase());
    }
}