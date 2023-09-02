package com.burmau.shop.repository.book;

import com.burmau.shop.model.book.Notebook;
import org.springframework.data.repository.CrudRepository;

public interface NoteRepository extends CrudRepository<Notebook, Long> {
}
