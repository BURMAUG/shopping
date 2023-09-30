package com.burmau.shop.drink;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
@Entity
record Drink(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long drinkID,
        String brand,
        String manufacturer,
        BigDecimal price) {
}
