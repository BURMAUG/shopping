package com.burmau.shop.model.fruit;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.math.*;

/**
 *  This is the strawberry class which inherited some universal methods from the abstract superclass Fruit.
 *  It has the fields strawberryID, price, and description.
 */
@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@ToString
public class Strawberry extends Fruit {
    /**
     * This serves as the ID for this fruit class, and it is auto-generated by the persistance java generator so, I don't need to control this.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long strawberryID;
    /**
     *  This indicates the price of the item per can.
     */
    private BigDecimal price = new BigDecimal("3.99").setScale(2, RoundingMode.HALF_UP);
    /**
     * This is how the item is describe to the customer or the whole company at large.
     */
    private final String description = "Sweet, soft, red coloured fruit.";

    /**
     * <h2>Returns fruit name</h2>
     * This will always return strawberry
     *
     * @return Strawberry.
     */
    @Override
    String getFruitType() {
        return "Strawberry";
    }

    /**
     * <h2>Compute the weight to return a price</h2>
     *
     * @param weightOfItem - get the weight of the current item
     * @return price of the fruit Strawberry.
     */
    @Override
    BigDecimal getFruitPrice(double weightOfItem) {
        weightOfItem = Math.ceil(weightOfItem);
        price = price.multiply(new BigDecimal(weightOfItem)).setScale(2, RoundingMode.HALF_UP);
        return price;
    }

    /**
     * <h2>Retrieves the description of the item.</h2>
     * @return description - The sweet, soft, red fruit.
     */
    @Override
    String getFruitDescription() {
        return description;
    }
}
