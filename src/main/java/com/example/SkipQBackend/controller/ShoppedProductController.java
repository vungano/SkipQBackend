package com.example.SkipQBackend.controller;

/*
Controller for the products in the db for shopping by customers that can be retrieved through the barcode
*/

import com.example.SkipQBackend.entity.ShoppedProduct;
import com.example.SkipQBackend.service.ShoppedProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShoppedProductController {

    @Autowired
    ShoppedProductService shoppedProductService;

    //API endpoint for adding new products to the database <<for admins only>>
    @PostMapping("/product")
    public ShoppedProduct addProduct(@RequestBody ShoppedProduct newProduct){
        return shoppedProductService.addProduct(newProduct);
    }

    //API endpoint to get a product by its barcode
    @GetMapping("/product/{productCode}")
    public ShoppedProduct getProductByCode(@PathVariable("productCode") Long productCode){
        return shoppedProductService.getProductByCode(productCode);
    }

}
