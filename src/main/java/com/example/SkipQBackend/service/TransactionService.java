package com.example.SkipQBackend.service;

/*
   Transaction Service Implementation
*/

import com.example.SkipQBackend.entity.Transaction;

public interface TransactionService {
    Boolean getTransactionStatus(int transactionId);

    int setTransactionStatus(int transactionId);

    int addTransaction(Transaction transaction);
}
