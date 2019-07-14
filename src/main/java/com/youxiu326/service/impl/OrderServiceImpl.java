package com.youxiu326.service.impl;

import com.youxiu326.annotation.MyResource;
import com.youxiu326.annotation.MyService;
import com.youxiu326.service.OrderService;
import com.youxiu326.service.ProductService;

@MyService
public class OrderServiceImpl implements OrderService {

    @MyResource
    private ProductService productService;

    @Override
    public void addOrder() {

        productService.updateQuantity();
        System.out.println("Add Order");
    }
}
