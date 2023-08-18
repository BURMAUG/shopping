package com.burmau.shop.model.fruit;

import java.math.BigDecimal;

public class Strawberry extends Fruit{
    private BigDecimal price;
    private String description;
    @Override
    String getFruitType() {
        return null;
    }

    @Override
    BigDecimal getFruitPrice() {
        return price;
    }

    @Override
    String getFruitDescription() {
        return null;
    }
}
