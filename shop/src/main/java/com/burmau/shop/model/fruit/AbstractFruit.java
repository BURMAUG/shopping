package com.burmau.shop.model.fruit;

import java.math.BigDecimal;
/**
 *  This is the superclass(parent) of all fruit class.
 */

public abstract class AbstractFruit {
    abstract String type();
    abstract BigDecimal price(double weightOfItem);
    abstract String description();
}
