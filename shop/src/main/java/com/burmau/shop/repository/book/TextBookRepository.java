package com.burmau.shop.repository.book;

import com.burmau.shop.model.book.Text;
import org.springframework.data.repository.CrudRepository;

public interface TextBookRepository extends CrudRepository<Text, Long> {
}
