package com.example.SkipQBackend.service;

/*
Detailed transaction service implementation
*/

import com.example.SkipQBackend.entity.DetailedTransaction;
import com.example.SkipQBackend.repository.DetailedTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailedTransactionServiceImplementation implements DetailedTransactionService{

    @Autowired
    DetailedTransactionRepository detailedTransactionRepository;

    @Override
    public List<DetailedTransaction> postTransaction(List<DetailedTransaction> detailedTransaction) {
        for(int i =0; i<detailedTransaction.size(); i++){
           detailedTransactionRepository.save(detailedTransaction.get(i));
        }
        return detailedTransaction;
    }

    @Override
    public List<DetailedTransaction> getAllById(int transactionId) {
        return  detailedTransactionRepository.findAllByTransactionId(transactionId);
    }
}
