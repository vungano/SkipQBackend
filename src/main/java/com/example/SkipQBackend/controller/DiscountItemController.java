package com.example.SkipQBackend.controller;

/*
 Controller for all the discounted items in the store
 */

import com.example.SkipQBackend.entity.DiscountItem;
import com.example.SkipQBackend.service.DiscountItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiscountItemController {

    @Autowired
    DiscountItemService discountItemService;

    //Endpoint to get all items on discount
    @GetMapping("/discountItems")
    public List<DiscountItem> getAllItems(){
        return discountItemService.getAllItems();
    }

    //Endpoint to post new item on discount <<for admins only>>
    @PostMapping("/discountItems")
    public DiscountItem postNewItem(@RequestBody DiscountItem discountItem){
        return  discountItemService.postNewItem(discountItem);
    }
}
