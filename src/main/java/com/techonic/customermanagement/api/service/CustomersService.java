package com.techonic.customermanagement.api.service;

import org.springframework.stereotype.Service;

@Service
public class CustomersService {

    public String findCustomerById(Long id) {
        return "findCustomerById " + id;
    }

    public String updateCustomer(Long id) {
        return "updateCustomer " + id;
    }

    public String createCustomer() {
        // in the future we could add more logic
        // validate inputs

        // save to db

        // send notification
        return "createCustomer ";
    }
}
