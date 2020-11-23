package com.example.store.customer;

import com.example.store.customer.repository.CustomerRepository;
import com.example.store.customer.service.CustomerService;
import com.example.store.customer.service.CustomerServiceImpl;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CustomerServiceMockTest {
    @Mock
    private CustomerRepository customerRepository;

    private CustomerService customerService;

    public void setup(){
        MockitoAnnotations.initMocks(this);
        customerService = new CustomerServiceImpl();
    }
}
