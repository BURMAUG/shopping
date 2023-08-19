package com.burmau.shop.model.fruit;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Entity
@ToString
@AllArgsConstructor @NoArgsConstructor
@Setter @Getter
public class Tomato extends Fruit{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tomatoID;
    private BigDecimal price = new BigDecimal("1.99").setScale(2, RoundingMode.HALF_UP);
    private final String description = "Red succulent fruit.";
    @Override
    String getFruitType() {
        return "Tomato";
    }

    @Override
    BigDecimal getFruitPrice(double weightOfItem) {
        weightOfItem = Math.ceil(weightOfItem);
        price = price.multiply(new BigDecimal(weightOfItem));
        return price;
    }

    @Override
    String getFruitDescription() {
        return description ;
    }
}
