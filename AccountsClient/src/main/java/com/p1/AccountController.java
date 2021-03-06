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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AccountController {



@Autowired
private AccountService service;




@GetMapping("/account")
public List<Accounts>list(){
return service.listAll();
}

@GetMapping("/account/{acct_num}")
public ResponseEntity<Accounts>get(@PathVariable Integer acct_num){
try{
Accounts account=service.get(acct_num);
return new ResponseEntity<Accounts>(account,HttpStatus.OK);
}
catch(NoSuchElementException e){
return new ResponseEntity<Accounts>(HttpStatus.NOT_FOUND);
}
}
@PostMapping("/account")
public void add(@RequestBody Accounts account){
service.save(account);
}

@PutMapping("/account/{acct_num}")
public ResponseEntity<?>update(@RequestBody Accounts account, @PathVariable Integer acct_num){
try{
Accounts existaccount = service.get(acct_num);
service.save(existaccount);
return new ResponseEntity<>(HttpStatus.OK);
}
catch(NoSuchElementException e)
{
return new ResponseEntity<>(HttpStatus.NOT_FOUND);
}
}



}
