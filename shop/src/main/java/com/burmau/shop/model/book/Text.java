package com.burmau.shop.model.book;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Setter @Getter
@AllArgsConstructor @NoArgsConstructor
@Entity
public class Text extends AbstractBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long textBookID;
    private String title;
    private String authorName;
    private final String TYPE = "Textbook";
    private BigDecimal price = new BigDecimal("1").setScale(2, RoundingMode.HALF_UP);
    Text(String title, String authorName, BigDecimal price){
        this.title = title;
        this.authorName = authorName;
        this.price = price;

    }
    @Override
    String type() {
        return TYPE;
    }

    @Override
    BigDecimal price() {
        return price;
    }
}
