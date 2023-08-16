package com.burmau.shop.service;

/**
 * This interface should get the items and query according to the fields declared in the Items model
 */
public interface ItemService {
    int numberOfItemsInStock();
    String itemDescription(String name);

}
