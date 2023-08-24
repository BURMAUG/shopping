package com.burmau.shop.model.fruit;

import jakarta.persistence.*;
import lombok.*;

import java.math.RoundingMode;

import java.math.BigDecimal;

/**
 * Here the pepper will be measure in pounds as in the USA
 * and for pepper 1lbs = .3 cents
 */
@Entity @Table
@Setter @Getter
@ToString
@NoArgsConstructor
public class Pepper extends Fruit{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pepperID;
    private double weight;
    private static final String NAME = "Pepper";
    private String type;
    private BigDecimal price = new BigDecimal(".30").setScale(2, RoundingMode.HALF_UP);
    private String description;//= "Hot and spicy pepper put with care!";
    Pepper(Long pepperID, double weight, String description){
        this.pepperID = pepperID;
        this.weight = weight;
        this.description = description;
    }
    public Pepper(double weight, String description){
        this.pepperID = getPepperID();
        this.weight = weight;
        this.description = description;
        this.price = getPrice();
        this.type = getFruitType();
    }

    /**
     *
     * @return pepper as a constant.
     */
    @Override
    String getFruitType() {
        return NAME;
    }


    /**
     * This method takes in weight as a parameter and the use that to calculate the price.
     * @return price
     */
    @Override
    BigDecimal getFruitPrice(double weight) {
        BigDecimal price = new BigDecimal(".38");
        price = price.multiply(new BigDecimal(weight));
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
