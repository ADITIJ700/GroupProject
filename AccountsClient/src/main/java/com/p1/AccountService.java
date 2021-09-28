package com.p1;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AccountService {

@Autowired
private AccountRepository repo1;



public List<Accounts> listAll() {
return repo1.findAll();
}



public void save(Accounts account) {
repo1.save(account);
}
public Accounts get(Integer acct_num) {
return repo1.findById(acct_num).get();
}
public void delete(Integer acct_num) {
repo1.deleteById(acct_num);
}




}
