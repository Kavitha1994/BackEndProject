package com.niit.EComBack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Supplier {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
int Supplierid;
	@Column(nullable=true,unique=false)

String Suppliername;
String Supplieraddress;
public int getSupplierid() {
	return Supplierid;
}
public void setSupplierid(int supplierid) {
	Supplierid = supplierid;
}
public String getSuppliername() {
	return Suppliername;
}
public void setSuppliername(String suppliername) {
	Suppliername = suppliername;
}
public String getSupplieraddress() {
	return Supplieraddress;
}
public void setSupplieraddress(String supplieraddress) {
	Supplieraddress = supplieraddress;
}
}
