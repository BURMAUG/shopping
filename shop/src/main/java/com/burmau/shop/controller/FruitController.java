package com.burmau.shop.controller;

import com.burmau.shop.model.book.Book;
import com.burmau.shop.model.book.Note;
import com.burmau.shop.model.book.Text;
import com.burmau.shop.model.fruit.Fruit;
import com.burmau.shop.model.fruit.Pepper;
import com.burmau.shop.model.fruit.Strawberry;
import com.burmau.shop.model.fruit.Tomato;
import com.burmau.shop.repository.book.TextBookRepository;
import com.burmau.shop.service.BookService;
import com.burmau.shop.service.FruitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/")
@AllArgsConstructor
public class FruitController {
    private final FruitService fruitService;
    private final BookService bookService;

    @GetMapping("/fruit")
    public Iterable<Fruit> getAllFruit(){
        return fruitService.findAllFruit();
    }
    @GetMapping("/fruit/peppers")
    public Iterable<Pepper> getAllPepper(){
        return fruitService.findAllPepper();
    }
    @GetMapping("/fruit/strawberries")
    public Iterable<Strawberry> getAllStrawberry(){
        return fruitService.findAllStrawberry();
    }
    @GetMapping("/fruit/tomatoes")
    public Iterable<Tomato> getAllTomato(){
        return  fruitService.findAllTomato();
    }

    @GetMapping("/book")
    public Iterable<Book> getAllBooks(){
        return bookService.findAllBooks();
    }
    @GetMapping("/book/text")
    public Iterable<Text> getAllTextbooks(){
        return bookService.findAllTextbooks();
    }
    @GetMapping("/book/note")
    public  Iterable<Note> getAllNotebooks(){
        return bookService.findAllNotebooks();
    }
    //POST
    @PostMapping("/peppers/")
    public void addPepper( @RequestBody Pepper pepper){
        fruitService.saveNewPepper(pepper);
    }

    @PostMapping("/strawberries/")
    public void addStrawberry(@RequestBody Strawberry strawberry){
        fruitService.saveNewStrawberry(strawberry);

    }
    @PostMapping("/tomatoes/")
    public void addTomato(@RequestBody Tomato tomato){
        fruitService.saveNewTomato(tomato);
    }

    //patch

    //delete
}
