package com.lambda.orders.demo.repositories;

import com.lambda.orders.demo.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customer, Long> {
}
