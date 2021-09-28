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
public class BankingController {

	@Autowired
	private BankingService service;

	@GetMapping("/banking")
	public List<Banking> listAll() {
		return service.listAll();
	}

	@GetMapping("/banking/{acct_num}")
	public ResponseEntity<Banking>get(@PathVariable Integer acct_num){
		try{
			Banking banking=service.get(acct_num);
			return new ResponseEntity<Banking>(banking,HttpStatus.OK);
		}
		catch(NoSuchElementException e){
			return new ResponseEntity<Banking>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/banking")
	public void add(@RequestBody Banking banking){
		service.save(banking);
	}
	
	@PutMapping("/banking/{acct_num}")
	public ResponseEntity<?>update(@RequestBody Banking banking, @PathVariable Integer acct_num){
		try{
			Banking existaccount = service.get(acct_num);
			service.save(existaccount);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
}}