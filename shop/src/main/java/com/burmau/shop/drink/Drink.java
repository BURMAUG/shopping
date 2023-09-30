package com.burmau.shop.drink;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
class Drink{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long drinkID;
        String brand;
        String manufacturer;
        BigDecimal price;
}
