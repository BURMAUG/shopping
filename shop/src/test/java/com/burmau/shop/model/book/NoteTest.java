package com.burmau.shop.model.book;

import org.junit.jupiter.api.Test;
import org.springframework.security.core.parameters.P;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

class NoteTest {
    private final Note book = new Note(12);

    @Test
    void getType() {
        String type = book.getType();
        assertEquals("Notebook", type);
    }

    @Test
    void getPrice() {
        BigDecimal price  = book.getPrice();
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
    }

    @Test
    void setPageCount() {
    }

    @Test
    void testToString() {
    }
}