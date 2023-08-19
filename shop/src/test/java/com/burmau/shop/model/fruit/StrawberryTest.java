package com.burmau.shop.model.fruit;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

class StrawberryTest {
    Fruit strawberry = new Strawberry();

    @Test
    void getFruitType() {
        assertEquals("strawberry", strawberry.getFruitType().toLowerCase());
    }

    @Test
    void getFruitPrice() {
        BigDecimal p = strawberry.getFruitPrice(.2);
        assertEquals(new BigDecimal("3.99").setScale(2, RoundingMode.HALF_UP), p);
    }

    @Test
    void getFruitDescription() {
        assertEquals("Sweet, soft, red coloured fruit.".toLowerCase(), strawberry.getFruitDescription().toLowerCase());
    }
}