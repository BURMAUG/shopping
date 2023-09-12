package com.burmau.shop.service.impl;

import com.burmau.shop.model.book.AbstractBook;
import com.burmau.shop.model.book.Notebook;
import com.burmau.shop.model.book.Textbook;
import com.burmau.shop.repository.book.NoteRepository;
import com.burmau.shop.repository.book.TextBookRepository;
import com.burmau.shop.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
        List<AbstractBook> b = new ArrayList<>();
        Iterator<Textbook> textbookIterator = textBookRepository.findAll().iterator();
        Iterator<Notebook> notebookIterator = noteRepository.findAll().iterator();

        while(textbookIterator.hasNext())
            b.add(textbookIterator.next());
        while (notebookIterator.hasNext())
            b.add(notebookIterator.next());
        return b;
    }

    @Override
    public Iterable<Textbook> findAllTextbooks() {
        return textBookRepository.findAll();
    }

    @Override
    public Iterable<Notebook> findAllNotebooks() {
        return noteRepository.findAll();
    }

    @Override
    public Iterable<Notebook> deleteNotebookBy(Long id) {
        noteRepository.deleteById(id);
        return noteRepository.findAll();
    }

    @Override
    public Iterable<Textbook> deleteTextbookBy(Long id) {
        textBookRepository.deleteById(id);
        return textBookRepository.findAll();
    }
}
