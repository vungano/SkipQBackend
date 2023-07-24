package com.example.SkipQBackend.controller;

/*
Controller for all the transactions
*/

import com.example.SkipQBackend.entity.Transaction;
import com.example.SkipQBackend.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    //Endpoint to get status of transaction
    @GetMapping("/getStatus/{transactionId}")
    public Boolean getTransactionStatus(@PathVariable("transactionId") int transactionId){
        return transactionService.getTransactionStatus(transactionId);
    }

    //Endpoint to change status of transaction to verified
    @PostMapping("/setStatus/{transactionId}")
    public int setTransactionStatus(@PathVariable("transactionId") int transactionId){
        return transactionService.setTransactionStatus(transactionId);
    }

    //Endpoint to add a new transaction once payment is verified
    @PostMapping("/setTransaction")
    public int addTransaction(@RequestBody Transaction transaction){
        return transactionService.addTransaction(transaction);
    }
}
