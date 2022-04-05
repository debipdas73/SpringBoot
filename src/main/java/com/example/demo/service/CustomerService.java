package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repo.CustomerRepository;

@Service
@Transactional
public class CustomerService {

	@Autowired
	private CustomerRepository repo1;

	public List<Customer> listAll() {
		return repo1.findAll();
	}

	
	
	  public void save1(Customer customer) { repo1.save(customer); }
	  
	 /* public Customer get(long id) { return repo1.findById(id).get(); }
	 * 
	 * public void delete1(long id) { repo1.deleteById(id); }
	 */
	 
}
