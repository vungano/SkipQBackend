package com.example.SkipQBackend.service;

/*
 Discount Item Service Implementation
*/

import com.example.SkipQBackend.entity.DiscountItem;
import com.example.SkipQBackend.repository.DiscountItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DiscountItemServiceImplementation implements DiscountItemService{

    @Autowired
    DiscountItemRepository discountItemRepository;

    @Override
    public List<DiscountItem> getAllItems() {
        return discountItemRepository.findAll();
    }

    @Override
    public DiscountItem postNewItem(DiscountItem discountItem) {
        return discountItemRepository.save(discountItem);
    }
}
