package com.burmau.shop.model.fruit;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * <h1>TOMATO</h1>
 * <p>This is a concrete class the extends the abstract parent class Fruit and implements all the methods.</p>
 */
@Entity
@ToString
@AllArgsConstructor @NoArgsConstructor
@Setter @Getter
public class Tomato extends Fruit{
    /**
     * The tomatoID fields is used by the entity or table to identify the item being queried.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tomatoID;
    /**
     * The price field is used to compute the price of the fruit per can.
     */
    private static final BigDecimal BASE_PRICE = new BigDecimal("1.99").setScale(2, RoundingMode.HALF_UP);
    private BigDecimal price = BASE_PRICE;
    /**
     * The description - describes the item to the customer or company at large.
     */
    private String description;
    private double weight;
    private static final String CATEGORY = "Tomato";
    private String type = CATEGORY;
    public Tomato(double weight, String description){
        this.setType(type());
        this.setWeight(weight);
        this.setPrice(getFruitPrice(weight));
        this.description = description;
    }

    public void setWeight(double weight){
        this.weight = weight;
        this.price = getFruitPrice(weight);
    }

    /**
     * <h2>Fruit Type</h2>
     * @return fruit name.
     */
    @Override
    String type() {
        return "Tomato";
    }

    /**
     * <h2>Price</h2>
     * @param weight - indict the count of the item in store.
     * @return price of the item
     */
    @Override
    BigDecimal getFruitPrice(double weight) {
        return BASE_PRICE.multiply(BigDecimal.valueOf(weight)).setScale(2, RoundingMode.HALF_UP);
    }

    /**
     * <h2>Description</h2>
     * @return the description of the item.
     */
    @Override
    String description() {
        return description ;
    }
}
