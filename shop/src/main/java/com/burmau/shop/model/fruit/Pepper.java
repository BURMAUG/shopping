package com.burmau.shop.model.fruit;

public class Pepper extends Fruit{
    private double price;
    private String description;
    @Override
    String getFruitType() {
        return "Pepper";
    }

    @Override
    double getFruitPrice() {
        return price;
    }

    @Override
    String getFruitDescription() {
        return description;
    }
}
