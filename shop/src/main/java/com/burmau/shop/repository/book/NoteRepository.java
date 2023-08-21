package com.burmau.shop.repository.book;

import com.burmau.shop.model.book.Note;
import org.springframework.data.repository.CrudRepository;

public interface NoteRepository extends CrudRepository<Note, Long> {
}
