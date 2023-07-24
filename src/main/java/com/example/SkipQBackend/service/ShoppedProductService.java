package com.example.SkipQBackend.service;

/*
Shopped Product Service
*/


import com.example.SkipQBackend.entity.ShoppedProduct;

public interface ShoppedProductService {
   public ShoppedProduct getProductByCode(Long productCode);

   public ShoppedProduct addProduct(ShoppedProduct newProduct);
}
