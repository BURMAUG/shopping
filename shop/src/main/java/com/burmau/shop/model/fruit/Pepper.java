package com.burmau.shop.model.fruit;

import java.math.BigDecimal;

public class Pepper extends Fruit{
    private BigDecimal price;
    private String description;
    @Override
    String getFruitType() {
        return "Pepper";
    }

    @Override
    BigDecimal getFruitPrice() {
        return price;
    }

    @Override
    String getFruitDescription() {
        return description;
    }
}
