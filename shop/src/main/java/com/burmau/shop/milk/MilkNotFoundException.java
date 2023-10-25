package com.burmau.shop.milk;

class MilkNotFoundException extends RuntimeException{
    MilkNotFoundException(String message){
        super(message);
    }
}
