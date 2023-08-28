package com.burmau.shop.service;

import com.burmau.shop.model.book.Book;
import com.burmau.shop.model.book.Note;
import com.burmau.shop.model.book.Text;

public interface BookService {
    void add(Note book);
    void add(Text book);

    Iterable<Book> findAllBooks();

    Iterable<Text> findAllTextbooks();

    Iterable<Note> findAllNotebooks();
}
