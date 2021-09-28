package com.p1;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Accounts {
int acct_num;
int custid;
String acctype;
String dateoOpening;
int bal;
String status;

public Accounts()
{}



public Accounts(int acct_num, int custid, String acctype, String dateoOpening, int bal, String status) {
this.acct_num = acct_num;
this.custid = custid;
this.acctype = acctype;
this.dateoOpening = dateoOpening;
this.bal = bal;
this.status = status;
}
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)


public int getAcct_num() {
return acct_num;
}



public void setAcct_num(int acct_num) {
this.acct_num = acct_num;
}



public int getCustid() {
return custid;
}



public void setCustid(int custid) {
this.custid = custid;
}



public String getAcctype() {
return acctype;
}



public void setAcctype(String acctype) {
this.acctype = acctype;
}



public String getDateoOpening() {
return dateoOpening;
}



public void setDateoOpening(String dateoOpening) {
this.dateoOpening = dateoOpening;
}



public int getBal() {
return bal;
}



public void setBal(int bal) {
this.bal = bal;
}



public String getStatus() {
return status;
}



public void setStatus(String status) {
this.status = status;
}
@Override
public String toString() {
return "Accounts [acct_num=" + acct_num + ", custid=" + custid + ", acctype=" + acctype + ", dateoOpening="
+ dateoOpening + ", bal=" + bal + ", status=" + status + "]";
}}