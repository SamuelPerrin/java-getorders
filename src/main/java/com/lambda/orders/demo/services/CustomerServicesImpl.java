package com.lambda.orders.demo.services;

import com.lambda.orders.demo.models.Customer;
import com.lambda.orders.demo.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Transactional
@Service
public class CustomerServicesImpl implements CustomerServices {
    @Autowired
    private CustomersRepository customersRepository;

    @Transactional
    @Override
    public Customer save(Customer customer) {
        return customersRepository.save(customer);
    }

    @Override
    public Customer findCustomerById(long custcode) {
        Customer customer = customersRepository.findById(custcode)
                .orElseThrow(() -> new EntityNotFoundException("Customer " + custcode + " not found!"));
        return customer;
    }
}
