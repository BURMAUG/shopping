package com.burmau.shop.rice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
class Rice {
    @Id
    Long riceID;
    String description;
    BigDecimal price;
}
