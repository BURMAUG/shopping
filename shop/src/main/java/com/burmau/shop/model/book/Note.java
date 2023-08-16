package com.burmau.shop.model.book;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class Note extends Book {

    private double price;
    private int pageCount;

    @Override
    String getType() {
        return "Notebook";
    }

    @Override
    double getPrice() {
        return price;
    }
}
