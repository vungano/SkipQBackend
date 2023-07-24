package com.example.SkipQBackend.service;

import com.example.SkipQBackend.entity.ShoppedProduct;
import com.example.SkipQBackend.repository.ShoppedProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
Shopped product service implementation
 */

@Service
public class ShoppedProductServiceImplementation implements ShoppedProductService {

    @Autowired
    ShoppedProductRepository shoppedProductRepository;

    @Override
    public ShoppedProduct getProductByCode(Long productCode) {
        try {
            return shoppedProductRepository.findById(productCode).get();
        } catch (Exception e) {
            return new ShoppedProduct();
        }

    }

    @Override
    public ShoppedProduct addProduct(ShoppedProduct newProduct) {
        return shoppedProductRepository.save(newProduct);
    }
}
