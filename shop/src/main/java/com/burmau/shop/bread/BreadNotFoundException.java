package com.burmau.shop.bread;

public class BreadNotFoundException extends RuntimeException{
    BreadNotFoundException(String message){
        super(message);
    }
}
