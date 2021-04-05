package com.techonic.customermanagement.api.repository;

import com.techonic.customermanagement.api.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {


}
