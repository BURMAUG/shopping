package com.burmau.shop.model.fruit;

import java.math.BigDecimal;

public abstract class Fruit {
    abstract String getFruitType();
//    abstract BigDecimal computePrice(double weight);
    abstract BigDecimal getFruitPrice(double weightOfItem);
    abstract String getFruitDescription();
}
