package com.burmau.shop.model.fruit;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PepperTest {
    private final Fruit pepper = new Pepper(2.2, "Hot and spicy pepper put with care!");
    @Test
    void getFruitType() {
        assertEquals("Pepper", pepper.type());
    }

    @Test
    void getFruitPrice() {
        BigDecimal p = pepper.price(.2);
        assertEquals(new BigDecimal("0.08"), p);
    }


    @Test
    void getFruitDescription() {
        String value = pepper.description();
        assertEquals("Hot and spicy pepper put with care!".toLowerCase(), value.toLowerCase());
    }
}