package com.burmau.shop.pepper;

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
class Pepper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long pepperID;
    String description;
    BigDecimal price;
}
