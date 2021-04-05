package com.techonic.customermanagement.api.service;

import com.techonic.customermanagement.api.entity.Customer;
import com.techonic.customermanagement.api.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomersService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomersService(CustomerRepository customerRepositor) {
        this.customerRepository = customerRepositor;
    }

    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id)
                .orElseThrow( () -> new IllegalArgumentException("Invalid customer id " + id));
    }

    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
