package com.burmau.shop.milk;

public class MilkNotFoundException extends RuntimeException{
    MilkNotFoundException(String message){
        super(message);
    }
}
