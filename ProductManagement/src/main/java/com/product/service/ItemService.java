package com.product.service;

import com.product.model.Items;

import java.util.List;

public interface ItemService {

    List<Items> listItems();
    void addItem(Items items);
    void removeItem(long itemId);
    void editItem(Items items);
}
