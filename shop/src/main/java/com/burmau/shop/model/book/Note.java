package com.burmau.shop.model.book;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Getter @Setter
@ToString
@AllArgsConstructor @NoArgsConstructor
@Entity
public class Note extends AbstractBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long noteID;
    private BigDecimal price = new BigDecimal(".1").setScale(2, RoundingMode.HALF_UP);
    private int pageCount;
    private final String TYPE = "Notebook";

    Note(int pageCount){
        this.pageCount = pageCount;
    }
    @Override
    String type() {
        return TYPE;
    }

    @Override
    BigDecimal price() {
        this.price = price.multiply(new BigDecimal(String.valueOf(pageCount)));
        return price;
    }
}
