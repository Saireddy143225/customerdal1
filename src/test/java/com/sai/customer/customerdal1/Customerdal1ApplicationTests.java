package com.sai.customer.customerdal1;

import com.sai.customer.customerdal1.entities.Customer;
import com.sai.customer.customerdal1.repos.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Customerdal1ApplicationTests {
    @Autowired
    private CustomerRepository repo;

    @Test
    void testCustomerInsert() {
        Customer customer=new Customer();
        customer.setName("Sai");
        customer.setEmail("sai@gmail.com");
        repo.save(customer);


    }
    @Test
    void testFIndCustomerById(){
        Customer customer=repo.findById(1l).get();
        System.out.println(customer);
    }
    @Test
    void testUpdateCustomrById(){
        Customer customer=repo.findById(1l).get();
        customer.setEmail("reddy@gmail.com");
        repo.save(customer);

    }
    @Test
    void testDeleteCustomerById(){
        Customer customer=repo.findById(1l).get();
        repo.delete(customer);
    }

}
