package com.techonic.customermanagement.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/customers")
public class CustomersController {

    public CustomersController() {
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> findCustomerById(@PathVariable Long id) {
        return new ResponseEntity<>("findCustomerById " + id, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCustomer(@PathVariable Long id) {
        return new ResponseEntity<>("updateCustomer " + id, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> createCustomer() {
        return new ResponseEntity<>("createCustomer ", HttpStatus.OK);
    }
}
