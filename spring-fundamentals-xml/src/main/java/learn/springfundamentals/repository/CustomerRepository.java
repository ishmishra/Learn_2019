package learn.springfundamentals.repository;

import learn.springfundamentals.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
