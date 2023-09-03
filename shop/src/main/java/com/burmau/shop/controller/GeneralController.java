package com.burmau.shop.controller;

import com.burmau.shop.model.book.AbstractBook;
import com.burmau.shop.model.fruit.AbstractFruit;
import com.burmau.shop.service.BookService;
import com.burmau.shop.service.FruitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class GeneralController {
    private final BookService bookService;
    private final FruitService fruitService;
    @GetMapping
    public Iterable<Object> storeItems(){
        ArrayList<Object> list = new ArrayList<>();
        Iterator<AbstractBook> booksIt = bookService.findAllBooks().iterator();
        Iterator<AbstractFruit> fruitsIt = fruitService.findAllFruit().iterator();
        while (booksIt.hasNext())
            list.add(booksIt.next());
        while (fruitsIt.hasNext())
            list.add(fruitsIt.next());
        return list;
    }

}
