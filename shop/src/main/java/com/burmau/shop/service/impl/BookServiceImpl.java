package com.burmau.shop.service.impl;

import com.burmau.shop.model.book.AbstractBook;
import com.burmau.shop.model.book.Note;
import com.burmau.shop.model.book.Text;
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
    public void add(Note book) {
        noteRepository.save(book);

    }

    @Override
    public void add(Text book) {
        textBookRepository.save(book);
    }

    @Override
    public Iterable<AbstractBook> findAllBooks() {
        return null;
    }

    @Override
    public Iterable<Text> findAllTextbooks() {
        return null;
    }

    @Override
    public Iterable<Note> findAllNotebooks() {
        return null;
    }
}
