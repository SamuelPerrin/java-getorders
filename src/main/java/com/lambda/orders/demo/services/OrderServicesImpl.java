package com.lambda.orders.demo.services;

import com.lambda.orders.demo.models.Order;
import com.lambda.orders.demo.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class OrderServicesImpl implements OrderServices {
    @Autowired
    private OrdersRepository ordersRepository;

    @Transactional

    @Override
    public Order save(Order order) {
        return ordersRepository.save(order);
    }
}
