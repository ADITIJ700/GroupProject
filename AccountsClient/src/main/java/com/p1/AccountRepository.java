package com.p1;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AccountRepository extends JpaRepository<Accounts,Integer>
{
	
}