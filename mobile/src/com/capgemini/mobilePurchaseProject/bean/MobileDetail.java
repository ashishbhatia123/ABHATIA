package com.capgemini.mobilePurchaseProject.bean;

public class MobileDetail {
private int mobileID;
private String mobileName;
private int quantity;
private int price;

public int getMobileID() {
	return mobileID;
}
public void setMobileName(String mobileName) {
	this.mobileName = mobileName;
}
public void setMobileID(int mobileID) {
	this.mobileID = mobileID;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getMobileName() {
	return mobileName;
}
public void setMobileNo(String mobileName) {
	this.mobileName = mobileName;
}

public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public MobileDetail( int quantity, String mobileName, int price) {
	super();
	
	this.quantity = quantity;
	this.mobileName = mobileName;
	this.price = price ;
}
@Override
public String toString() {
	return "MobileDetail [mobileID=" + mobileID + ", quantity=" + quantity + ", mobileName=" + mobileName +"price="+ price+ "]";
}


}