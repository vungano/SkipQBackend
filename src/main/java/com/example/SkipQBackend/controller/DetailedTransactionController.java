package com.example.SkipQBackend.controller;

/*
The controller for getting and posting all transactions with the same id to the db
*/


import com.example.SkipQBackend.entity.DetailedTransaction;
import com.example.SkipQBackend.service.DetailedTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DetailedTransactionController {

    @Autowired
    DetailedTransactionService detailedTransactionService;

    //Endpoint to post all items in the shopping cart to the db
    @PostMapping("/postTransaction")
    public List<DetailedTransaction> postTransaction(@RequestBody List<DetailedTransaction> detailedTransaction){
        return detailedTransactionService.postTransaction(detailedTransaction);
    }

    //Endpoint to get all items with the same id
    @GetMapping("/getAllTransactionById/{transactionId}")
    public List<DetailedTransaction> getAllById(@PathVariable("transactionId") int transactionId){
        return detailedTransactionService.getAllById(transactionId);
    }
}
