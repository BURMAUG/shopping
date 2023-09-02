package com.burmau.shop.model.fruit;

import jakarta.persistence.*;
import lombok.*;

import java.math.RoundingMode;
import java.math.BigDecimal;

@Entity
@Table(name = "pepper")
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Pepper extends AbstractFruit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pepperID;

    private double weight;

    private static final String NAME = "Pepper";

    private static final BigDecimal BASE_PRICE = new BigDecimal(".30").setScale(2, RoundingMode.HALF_UP);
    private BigDecimal price = BASE_PRICE;

    private String type = NAME;
    private String description;

    public Pepper(Long pepperID, double weight, String description) {
        this.setType(NAME);
        this.setPrice(getFruitPrice(weight));
        this.setWeight(weight);
        this.pepperID = pepperID;
        this.description = description;
    }

    public Pepper(double weight, String description) {
        this.weight = weight;
        this.description = description;
        this.type = type();
    }

    public void setWeight(double weight) {
        this.weight = weight;
        this.price = getFruitPrice(weight);
    }

    @Override
    public String type() {
        return NAME;
    }

    @Override
    public BigDecimal getFruitPrice(double weight) {
        return BASE_PRICE.multiply(BigDecimal.valueOf(weight)).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public String description() {
        return description;
    }
}
