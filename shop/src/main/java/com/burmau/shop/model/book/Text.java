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

@Setter @Getter
@AllArgsConstructor @NoArgsConstructor
@Entity
public class Text extends Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long textBookID;
    private String title;
    private String author;
    private BigDecimal price;
    @Override
    String getType() {
        return null;
    }

    @Override
    double getPrice() {
        return 0;
    }
}
