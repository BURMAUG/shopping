package com.burmau.shop.model.book;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

class NoteTest {
    private final Note book = new Note(12);

    @Test
    void getType() {
        String type = book.type();
        assertEquals("Notebook", type);
    }

    @Test
    void getPrice() {
        BigDecimal price  = book.price();
        assertEquals(new BigDecimal("1.2").setScale(2, RoundingMode.HALF_UP), price);
    }

    @Test
    void getNoteID() {
        book.setNoteID(13L);
        Long id = book.getNoteID();
        assertEquals(13L, id);
    }

    @Test
    void getPageCount() {
        double count = book.getPageCount();
        assertEquals(12, count);
    }

    @Test
    void setNoteID() {
        book.setNoteID(12L);
        assertEquals(12L, book.getNoteID());
    }

    @Test
    void setPrice() {
        book.setPrice(new BigDecimal("1.23"));
        assertEquals(new BigDecimal("14.76"), book.price());
    }

    @Test
    void setPageCount() {
        book.setPageCount(100);
        assertEquals(100, book.getPageCount());
    }

    @Test
    void testToString() {
    }
}