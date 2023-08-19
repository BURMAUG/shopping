package com.burmau.shop.model.fruit;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.math.*;

/**
 *
 */
@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@ToString
public class Strawberry extends Fruit{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long strawberryID;
    private BigDecimal price = new BigDecimal("3.99").setScale(2, RoundingMode.HALF_UP);
    private String description;

    /**
     *   This will always return strawberry
     * @return Strawberry.
     */
    @Override
    String getFruitType() {
        return "Strawberry";
    }

    /**
     * Compute the weight to return a price
     * @param  weightOfItem - get the weight of the current item
     * @return price of the fruit Strawberry.
     */
    @Override
    BigDecimal getFruitPrice(double weightOfItem) {
        weightOfItem= Math.ceil(weightOfItem);
        price = price.multiply(new BigDecimal(weightOfItem)).setScale(2, RoundingMode.HALF_UP);
        return price;
    }

    /**
     *
     * @return The sweet, soft, red fruit.
     */
    @Override
    String getFruitDescription() {
        return "Sweet, soft, red coloured fruit.";
    }
}
