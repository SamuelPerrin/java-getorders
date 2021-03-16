package com.lambda.orders.demo.services;

import com.lambda.orders.demo.models.Customer;

public interface CustomerServices {
    Customer save(Customer customer);

    Customer findCustomerById(long custcode);
}
