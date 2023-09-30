package com.burmau.shop.milk;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;
@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@ToString
@EqualsAndHashCode
class Milk{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;
        String brand;
        BigDecimal price;
}
