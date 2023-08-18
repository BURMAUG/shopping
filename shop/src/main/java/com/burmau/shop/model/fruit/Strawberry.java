package com.burmau.shop.model.fruit;

import java.math.BigDecimal;

public class Strawberry extends Fruit{
    private BigDecimal price;
    private int amount;
    private String description;
    @Override
    String getFruitType() {
        return null;
    }

    @Override
    BigDecimal getFruitPrice(double weightOfItem) {
        return null;
    }

    @Override
    String getFruitDescription() {
        return null;
    }
}
