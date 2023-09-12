package com.burmau.shop.service;

import com.burmau.shop.model.book.AbstractBook;
import com.burmau.shop.model.book.Notebook;
import com.burmau.shop.model.book.Textbook;

import org.springframework.stereotype.Service;

@Service
public interface BookService {
    void add(Notebook book);
    void add(Textbook book);

    Iterable<AbstractBook> findAllBooks();

    Iterable<Textbook> findAllTextbooks();

    Iterable<Notebook> findAllNotebooks();

    Iterable<Notebook> deleteNotebookBy(Long id);

    Iterable<Textbook> deleteTextbookBy(Long id);
}
