package learn.springfundamentals.repository;

import learn.springfundamentals.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {

        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();

        customer.setFirstName("Ish");
        customer.setLastName("M");

        customers.add(customer);

        return customers;
    }
}
