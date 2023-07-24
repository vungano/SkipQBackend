package com.example.SkipQBackend.entity;

/*
Each transaction will have its own unique transaction id and initially the transaction status is not verified
but after checkout at security the status will be turned to verified and the customer can exit the shop
*/

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int transactionId;              //Auto generated id
    private Boolean transactionVerified;    // Status of transaction
    private String transactionTime;         // Time of transaction
    private Double transactionAmount;       //Amount of transaction
}
