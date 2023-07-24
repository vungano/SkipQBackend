package com.example.SkipQBackend.entity;

/*
When the customer's payment is verified the products in his or her cart are posted to the database and this
is the entity for that information. On checkout the security will retrieve the customer's scanned products by
the transaction id since items in the same cart have the same transaction id from his own device/
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
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class DetailedTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;              //AUTO generated ID
    private int transactionId;   //Transaction id of the product
    private String productName;  // Name of product
    private double productPrice; //Price of product
    private int quantity;        //Quantity of that particular product
    private double totalPrice;  //Total price i.e quantity * productPrice

}
