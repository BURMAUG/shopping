package com.burmau.shop.model;

public record Item(
        long itemId,
        String name,
        String description,
        int stockQuantity,
        int itemPerQuantity,
        double prices) {}
