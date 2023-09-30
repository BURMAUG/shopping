package com.burmau.shop.drink;

class DrinkNotFoundException extends RuntimeException{
    DrinkNotFoundException(String message){
        super(message);
    }
}
