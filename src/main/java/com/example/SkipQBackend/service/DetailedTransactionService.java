package com.example.SkipQBackend.service;

/*
Detailed Transaction Service
*/

import com.example.SkipQBackend.entity.DetailedTransaction;
import java.util.List;

public interface DetailedTransactionService {
    List<DetailedTransaction> postTransaction(List<DetailedTransaction> detailedTransaction);
    List<DetailedTransaction> getAllById(int transactionId);
}
