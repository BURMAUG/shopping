package com.burmau.shop.model.fruit;

import java.math.BigDecimal;
/**
 *  This is the superclass(parent) of all fruit class.
 */

public abstract class Fruit {
    abstract String getFruitType();
    abstract BigDecimal getFruitPrice(double weightOfItem);
    abstract String getFruitDescription();
}
