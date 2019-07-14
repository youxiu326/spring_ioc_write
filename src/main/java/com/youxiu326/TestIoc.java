package com.youxiu326;

import com.youxiu326.service.OrderService;
import com.youxiu326.spring.ClassPathApplicationContext;

public class TestIoc {

    public static void main(String[] args) throws Exception {

        ClassPathApplicationContext context = new ClassPathApplicationContext("com.youxiu326");

        OrderService orderService = (OrderService) context.getBean("orderServiceImpl");
        orderService.addOrder();


    }

}
