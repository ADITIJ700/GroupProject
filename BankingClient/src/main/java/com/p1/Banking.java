package com.p1;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Banking {
int trn_num;
int acct_num;
String dotrn;
int amount;

public Banking()
{}



public Banking(int trn_num, int acct_num, String dotrn, int amount) {
this.trn_num = trn_num;
this.acct_num = acct_num;
this.dotrn = dotrn;
this.amount = amount;
}
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)



public int getTrn_num() {
return trn_num;
}



public void setTrn_num(int trn_num) {
this.trn_num = trn_num;
}



public int getAcct_num() {
return acct_num;
}



public void setAcct_num(int acct_num) {
this.acct_num = acct_num;
}



public String getDotrn() {
return dotrn;
}



public void setDotrn(String dotrn) {
this.dotrn = dotrn;
}



public int getAmount() {
return amount;
}



public void setAmount(int amount) {
this.amount = amount;
}



@Override
public String toString() {
return "Banking [trn_num=" + trn_num + ", acc_num=" + acct_num + ", dotrn=" + dotrn + ", amount=" + amount + "]";
}}
