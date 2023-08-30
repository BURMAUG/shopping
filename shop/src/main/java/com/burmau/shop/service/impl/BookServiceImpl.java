package com.burmau.shop.service.impl;

import com.burmau.shop.model.book.AbstractBook;
import com.burmau.shop.model.book.Notebook;
import com.burmau.shop.model.book.Textbook;
import com.burmau.shop.repository.book.NoteRepository;
import com.burmau.shop.repository.book.TextBookRepository;
import com.burmau.shop.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {
    private final TextBookRepository textBookRepository;
    private final NoteRepository noteRepository;
    @Override
    public void add(Notebook book) {
        noteRepository.save(book);

    }

    @Override
    public void add(Textbook book) {
        textBookRepository.save(book);
    }

    @Override
    public Iterable<AbstractBook> findAllBooks() {
        return null;
    }

    @Override
    public Iterable<Textbook> findAllTextbooks() {
        return null;
    }

    @Override
    public Iterable<Notebook> findAllNotebooks() {
        return null;
    }
}
