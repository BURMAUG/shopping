package com.burmau.shop.model.fruit;

import lombok.Setter;
import lombok.ToString;

import java.math.RoundingMode;

import java.math.BigDecimal;

/**
 * Here the pepper will be measure in pounds as in the USA
 * and for pepper 1lbs = .3 cents
 */
@Setter
@ToString
public class Pepper extends Fruit{
    private static BigDecimal price = new BigDecimal(".30").setScale(2, RoundingMode.HALF_UP);
    private final String description = "Hot and spicy pepper put with care!";

    /**
     *
     * @return pepper as a constant.
     */
    @Override
    String getFruitType() {
        return "Pepper";
    }


    /**
     * This method takes in weight as a parameter and the use that to calculate the price.
     * @param weightOfItem
     * @return price
     */
    @Override
    BigDecimal getFruitPrice(double weightOfItem) {
        price = price.multiply(new BigDecimal(weightOfItem));
        return price.setScale(2, RoundingMode.HALF_UP);
    }

    /**
     * This should return the description of the pepper
     * @return description
     */
    @Override
    String getFruitDescription() {
        return description;
    }
}
