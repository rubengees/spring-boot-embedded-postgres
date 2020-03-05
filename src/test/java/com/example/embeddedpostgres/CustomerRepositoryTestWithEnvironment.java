package com.example.embeddedpostgres;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CustomerRepositoryTestWithEnvironment {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void shouldFindCustomer() {
        final Customer customer = customerRepository.findByName("Test1");

        assertNotNull(customer);
        assertEquals("Test1", customer.getName());
    }
}
