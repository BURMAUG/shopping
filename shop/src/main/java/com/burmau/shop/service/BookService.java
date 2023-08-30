package com.burmau.shop.service;

import com.burmau.shop.model.book.AbstractBook;
import com.burmau.shop.model.book.Note;
import com.burmau.shop.model.book.Text;

import org.springframework.stereotype.Service;

@Service
public interface BookService {
    void add(Note book);
    void add(Text book);

    Iterable<AbstractBook> findAllBooks();

    Iterable<Text> findAllTextbooks();

    Iterable<Note> findAllNotebooks();
}
