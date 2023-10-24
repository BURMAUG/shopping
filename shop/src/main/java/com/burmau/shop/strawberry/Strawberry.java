package com.burmau.shop.strawberry;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@ToString @EqualsAndHashCode
public class Strawberry {
    @Id
    Long strawberryID;
    String brand;
    BigDecimal price;
}
