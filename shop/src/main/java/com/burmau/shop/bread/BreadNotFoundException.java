package com.burmau.shop.bread;

class BreadNotFoundException extends RuntimeException{
    BreadNotFoundException(String message){
        super(message);
    }
}
