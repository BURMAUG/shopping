package com.burmau.shop.model.fruit;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.math.*;
@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@ToString
public class Strawberry extends Fruit{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long strawberryID;
    private BigDecimal price;
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
