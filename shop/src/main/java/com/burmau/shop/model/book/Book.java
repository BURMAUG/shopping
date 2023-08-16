package com.burmau.shop.model.book;

public abstract class Book {
    String type; //Notebook or Text
    double price;

   abstract String getType();
    abstract double getPrice();
}
