package com.youxiu326.service.impl;

import com.youxiu326.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public void updateQuantity() {
        System.out.println("Update Quantity");
    }
}
