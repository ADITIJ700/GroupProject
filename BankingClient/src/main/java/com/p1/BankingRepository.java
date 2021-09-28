package com.p1;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface BankingRepository extends JpaRepository<Banking,Integer>
{
	List<Banking> getById(int acct_num);
}