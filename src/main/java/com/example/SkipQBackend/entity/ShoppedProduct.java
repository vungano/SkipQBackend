package com.example.SkipQBackend.entity;
/*
The main product entity with the variables defined and the id being the scanned barcode
*/

import jakarta.persistence.Entity;
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
public class ShoppedProduct {

@Id
private Long productCode;         //The barcode that gets scanned by the user
private String imageUrl;          // The image URL of the product can be displayed in the frontend
private String productName;       //The name of the product
private double productPrice;      //The price of the product
private String productionDate;    //The production date of the product
private String expiryDate;        //The expiry date of the product
private String manufacturer;      //The manufacture of the product
private String productionCountry; //The country in which the product was manufactured
private Boolean promotion;        // Identifier of whether the product is on promotion or not
}
