package com.sai.customer.customerdal1.repos;

import com.sai.customer.customerdal1.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer,Long> {
}
