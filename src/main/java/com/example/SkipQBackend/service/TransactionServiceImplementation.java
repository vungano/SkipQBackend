package com.example.SkipQBackend.service;

/*
Transaction service implementation
 */

import com.example.SkipQBackend.entity.Transaction;
import com.example.SkipQBackend.repository.TransactionRepository;
import org.hibernate.spi.TreatedNavigablePath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TransactionServiceImplementation implements TransactionService{

    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public Boolean getTransactionStatus(int transactionId) {
        Optional<Transaction> transaction = transactionRepository.findById(transactionId);
        return transaction.get().getTransactionVerified();
    }

    @Override
    public int setTransactionStatus(int transactionId) {
        return transactionRepository.setTransactionStatus(transactionId);
    }

    @Override
    public int addTransaction(Transaction transaction) {
        Transaction transaction2 = transactionRepository.save(transaction);
        return transaction2.getTransactionId();
    }
}
