package com.p1;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Customer {
int custid;
String cname;
String dob;
String mail;
public Customer()
{}
public Customer(int custid, String cname, String dob, String mail) {
this.custid = custid;
this.cname = cname;
this.dob = dob;
this.mail = mail;
}
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public int getCustid() {
return custid;
}
public void setCustid(int custid) {
this.custid = custid;
}
public String getCname() {
return cname;
}
public void setCname(String cname) {
this.cname = cname;
}
public String getDob() {
return dob;
}
public void setDob(String dob) {
this.dob = dob;
}
public String getMail() {
return mail;
}
public void setMail(String mail) {
this.mail = mail;
}
@Override
public String toString() {
return "Customer [custid=" + custid + ", cname=" + cname + ", dob=" + dob + ", mail=" + mail + "]";
}}