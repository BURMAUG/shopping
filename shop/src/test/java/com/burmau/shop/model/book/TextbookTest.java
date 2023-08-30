package com.burmau.shop.model.book;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

class TextbookTest {
    private final AbstractBook abstractBook = new Textbook("Boone","Mike" ,new BigDecimal("38.99").setScale(2, RoundingMode.HALF_UP));

    @Test
    void getType() {
        assertEquals("textbook", abstractBook.type().toLowerCase());
    }

    @Test
    void getPrice() {
        assertEquals(new BigDecimal("38.99"), abstractBook.price());
    }

    @Test
    void getTextBookID() {
    }

    @Test
    void getTitle() {
    }

    @Test
    void getAuthorName() {
    }

    @Test
    void setTextBookID() {
    }

    @Test
    void setTitle() {
    }

    @Test
    void setAuthorName() {
    }

    @Test
    void setPrice() {
    }
}