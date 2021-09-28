package com.p1;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CustomerController {
	@Autowired
	private CustomerService service;
	
	@GetMapping("/customers")
	public List<Customer>list(){
		return service.listAll();
	}
	@GetMapping("/customers/{custid}")
	public ResponseEntity<Customer>get(@PathVariable Integer custid){
		try{
			Customer customer=service.get(custid);
			return new ResponseEntity<Customer>(customer,HttpStatus.OK);
		}
		catch(NoSuchElementException e){
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/customers")
	public void add(@RequestBody Customer customer){
		service.save(customer);
	}
	
	@PutMapping("/customers/{custid}")
	public ResponseEntity<?>update(@RequestBody Customer customer,@PathVariable Integer custid){
		try{
			Customer existCustomer = service.get(custid);
			service.save(customer);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	


}

