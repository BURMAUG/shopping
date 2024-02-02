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
public class Drink {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long drinkID;
        private String brand;
        private String manufacturer;
        private BigDecimal price;
}
