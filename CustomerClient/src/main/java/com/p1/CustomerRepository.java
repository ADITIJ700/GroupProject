package com.p1;
import org.springframework.data.jpa.repository.JpaRepository;
import com.p1.Customer;
public interface CustomerRepository extends JpaRepository<Customer,Integer>
{
	}