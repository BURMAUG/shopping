package com.burmau.shop.model.book;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

class TextTest {
    private final Book book = new Text("Nothing Ever", "Me", new BigDecimal(1234.23).setScale(2, RoundingMode.HALF_UP));
    @Test
    void testGetType() {
        assertEquals("Textbook", book.getType());
    }

    @Test
    void testGetPrice() {
    }

    @Test
    void testGetTextBookID() {
    }

    @Test
    void testGetTitle() {
    }

    @Test
    void getAuthorName() {
    }

    @Test
    void testSetTextBookID() {
    }

    @Test
    void testSetTitle() {
    }

    @Test
    void setAuthorName() {
    }

    @Test
    void testSetPrice() {
    }
}