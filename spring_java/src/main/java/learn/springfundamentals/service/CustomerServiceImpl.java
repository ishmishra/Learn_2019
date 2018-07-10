package learn.springfundamentals.service;

import learn.springfundamentals.model.Customer;
import learn.springfundamentals.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerServiceImpl() {

    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
