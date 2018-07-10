package learn.springfundamentals.service;

import learn.springfundamentals.model.Customer;
import learn.springfundamentals.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    //Autowiring at member level
    //@Autowired
    private CustomerRepository customerRepository;

    //Autowiring at constructor level
    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    //Autowiring at method level
/*    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }*/
}
