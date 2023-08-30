package com.burmau.shop.controller;

import com.burmau.shop.model.book.AbstractBook;
import com.burmau.shop.model.book.Note;
import com.burmau.shop.model.book.Text;
import com.burmau.shop.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
@AllArgsConstructor
public class BookController {
    private final BookService bookService;
    @GetMapping("/")
    public Iterable<AbstractBook> getAllBooks() {
        return bookService.findAllBooks();
    }

    @GetMapping("/text")
    public Iterable<Text> getAllTextbooks() {
        return bookService.findAllTextbooks();
    }

    @GetMapping("/note")
    public Iterable<Note> getAllNotebooks() {
        return bookService.findAllNotebooks();
    }
}
