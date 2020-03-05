package com.example.embeddedpostgres;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CustomerRepositoryDataTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void shouldFindCustomer() {
        final Customer customer = customerRepository.findByName("Test1");

        assertNotNull(customer);
        assertEquals("Test1", customer.getName());
    }
}
