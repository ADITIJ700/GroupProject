package com.p1;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class BankingService {

	@Autowired 
	private BankingRepository repo;

	public List<Banking> listAll() { 
		return repo.findAll(); 
	}
	
	public BankingList getTrans(int acct_num) {
		BankingList list = new BankingList();
		list.setList(repo.getById(acct_num));
	    return list;
	}

	public void save(Banking banking) { 
		repo.save(banking);
	}
	public Banking get(Integer acct_num) { 
		return repo.findById(acct_num).get();
	}
	public void delete(Integer acct_num) { 
		repo.deleteById(acct_num);
		
	}
	
	
}
