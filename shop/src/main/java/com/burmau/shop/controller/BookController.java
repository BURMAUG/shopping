package com.burmau.shop.controller;

import com.burmau.shop.model.book.AbstractBook;
import com.burmau.shop.model.book.Notebook;
import com.burmau.shop.model.book.Textbook;
import com.burmau.shop.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/books")
@AllArgsConstructor
public class BookController {
    private final BookService bookService;
    @GetMapping("/")
    public Iterable<AbstractBook> getAllBooks() {
        return bookService.findAllBooks();
    }

    @GetMapping("/textbook")
    public Iterable<Textbook> getAllTextbooks() {
        return bookService.findAllTextbooks();
    }

    @GetMapping("/notebook")
    public Iterable<Notebook> getAllNotebooks() {
        return bookService.findAllNotebooks();
    }
    @PostMapping("/notebook")
    public void addNotebook(@RequestBody Notebook notebook){
        bookService.add(notebook);
    }
}