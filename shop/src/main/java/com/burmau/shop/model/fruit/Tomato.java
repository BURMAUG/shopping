package com.burmau.shop.model.fruit;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;

@Entity
@ToString
@AllArgsConstructor @NoArgsConstructor
@Setter @Getter
public class Tomato extends Fruit{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tomatoID;
    private BigDecimal price;
    private int amount;
    private String description;
    @Override
    String getFruitType() {
        return null;
    }

    @Override
    BigDecimal getFruitPrice(double weightOfItem) {
        return null;
    }

    @Override
    String getFruitDescription() {
        return null;
    }
}
