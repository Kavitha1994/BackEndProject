package com.niit.EComBack.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Product {
	@Id
	@GeneratedValue
int ProductId;
String ProductName;
String ProductDesc;
int SuppilerId;
int CategoryId;
int Price;
int Stock;
public int getProductId() {
	return ProductId;
}
public void setProductId(int productId) {
	ProductId = productId;
}
public String getProductName() {
	return ProductName;
}
public void setProductName(String productName) {
	ProductName = productName;
}
public String getProductDesc() {
	return ProductDesc;
}
public void setProductDesc(String productDesc) {
	ProductDesc = productDesc;
}
public int getSuppilerId() {
	return SuppilerId;
}
public void setSuppilerId(int suppilerId) {
	SuppilerId = suppilerId;
}
public int getCategoryId() {
	return CategoryId;
}
public void setCategoryId(int categoryId) {
	CategoryId = categoryId;
}
public int getPrice() {
	return Price;
}
public void setPrice(int price) {
	Price = price;
}
public int getStock() {
	return Stock;
}
public void setStock(int stock) {
	Stock = stock;
}
}
