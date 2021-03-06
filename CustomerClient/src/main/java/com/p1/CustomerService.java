package com.p1;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.p1.Customer;


@Service
@Transactional
public class CustomerService {
	@Autowired
	private CustomerRepository repo;

	
	public List<Customer> listAll(){
		return repo.findAll();
	}
	public void save(Customer customer){
		repo.save(customer);
	}
	public Customer get(Integer custid){
		return repo.findById(custid).get();
	}
	
}

