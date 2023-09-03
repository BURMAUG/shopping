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
public class Tomato extends AbstractFruit {
    /**
     * The tomatoID fields is used by the entity or table to identify the item being queried.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tomatoID;
    /**
     * The price field is used to compute the price of the fruit per can.
     */
    private BigDecimal price;//= new BigDecimal("1.99").setScale(2, RoundingMode.HALF_UP);
    /**
     * The description - describes the item to the customer or company at large.
     */
    private String description;
    private double itemCount;
    private String type;
    public Tomato(double itemCount, String description, String type){
        this.itemCount = itemCount;
        this.description = description;
        this.type = type;
        setPrice(new BigDecimal("1,99").setScale(2,RoundingMode.HALF_UP));
        this.price = price(itemCount);
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
     * @param itemCount - indict the count of the item in store.
     * @return price of the item
     */
    @Override
    BigDecimal price(double itemCount) {
        itemCount = Math.ceil(itemCount);
        price = price.multiply(new BigDecimal(itemCount));
        return price;
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
