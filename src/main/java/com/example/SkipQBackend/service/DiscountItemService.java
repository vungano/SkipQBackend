package com.example.SkipQBackend.service;

/*
    Discount Item Service
*/

import com.example.SkipQBackend.entity.DiscountItem;
import java.util.List;

public interface DiscountItemService {
    List<DiscountItem> getAllItems();

    DiscountItem postNewItem(DiscountItem discountItem);
}
