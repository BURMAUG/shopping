package com.burmau.shop.model.book;

import java.math.BigDecimal;

public abstract class Book {
    abstract String getType();
    abstract BigDecimal getPrice();
}