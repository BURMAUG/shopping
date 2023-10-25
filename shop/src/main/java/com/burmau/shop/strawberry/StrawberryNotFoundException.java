package com.burmau.shop.strawberry;

public class StrawberryNotFoundException extends RuntimeException{
    StrawberryNotFoundException(String message){
        super(message);
    }
}
