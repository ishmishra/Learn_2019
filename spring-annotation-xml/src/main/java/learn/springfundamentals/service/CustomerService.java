package learn.springfundamentals.service;

import learn.springfundamentals.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
