package learn.springfundamentals.service;

import learn.springfundamentals.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
