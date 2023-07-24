package com.example.SkipQBackend.entity;

/*
The entity that describes the products currently on promotion in the store with its variables as defined
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
public class DiscountItem {

    @Id
    private String imageUrl;    //URL of the product image to be displayed in the frontend
    private String productName; //Name of the product
    private Double oldPrice;    //The old price before the discount
    private Double newPrice;    //The new price after the discount
}
