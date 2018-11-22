package com.niit.EComBack.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class UserDetail {
	@Id
	
String UserName;
String Password;
Boolean enabled;

String Mobilno;
String Emailid;
String Address;
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public Boolean getEnabled() {
	return enabled;
}
public void setEnabled(Boolean enabled) {
	this.enabled = enabled;
}
public String getMobilno() {
	return Mobilno;
}
public void setMobilno(String mobilno) {
	Mobilno = mobilno;
}
public String getEmailid() {
	return Emailid;
}
public void setEmailid(String emailid) {
	Emailid = emailid;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
}
