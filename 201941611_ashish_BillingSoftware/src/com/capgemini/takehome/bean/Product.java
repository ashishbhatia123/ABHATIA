package com.capgemini.takehome.bean;

public class Product {
private int productId;
private String productName;
private String productcateg;
private int productprice;
public Product(int productId, String productName, String productcateg, int productprice) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productcateg = productcateg;
	this.productprice = productprice;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductcateg() {
	return productcateg;
}
public void setProductcateg(String productcateg) {
	this.productcateg = productcateg;
}
public int getProductprice() {
	return productprice;
}
public void setProductprice(int productprice) {
	this.productprice = productprice;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + productId;
	result = prime * result + ((productName == null) ? 0 : productName.hashCode());
	result = prime * result + ((productcateg == null) ? 0 : productcateg.hashCode());
	result = prime * result + productprice;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Product other = (Product) obj;
	if (productId != other.productId)
		return false;
	if (productName == null) {
		if (other.productName != null)
			return false;
	} else if (!productName.equals(other.productName))
		return false;
	if (productcateg == null) {
		if (other.productcateg != null)
			return false;
	} else if (!productcateg.equals(other.productcateg))
		return false;
	if (productprice != other.productprice)
		return false;
	return true;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", productcateg=" + productcateg
			+ ", productprice=" + productprice + "]";
}

}
