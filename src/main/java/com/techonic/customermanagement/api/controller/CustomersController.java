package com.techonic.customermanagement.api.controller;

import com.techonic.customermanagement.api.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/customers")
public class CustomersController {

    private CustomersService customersService;

    @Autowired
    public CustomersController(CustomersService customersService) {
        this.customersService = customersService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> findCustomerById(@PathVariable Long id) {
        return new ResponseEntity<>(customersService.findCustomerById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCustomer(@PathVariable Long id) {
        return new ResponseEntity<>(customersService.updateCustomer(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> createCustomer() {
        return new ResponseEntity<>(customersService.createCustomer(), HttpStatus.CREATED);
    }
}
