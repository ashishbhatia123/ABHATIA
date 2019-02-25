package com.capgemini.takehome.ui;

import java.util.Scanner;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.service.IProductService;
import com.capgemini.takehome.service.ProductService;

public class Client {
	 IProductService serviceObj = new ProductService();
public static void main(String[] args) {
	 IProductService serviceObj = new ProductService();
	 int prodId;
	int prodQuant;
	Product p ;
	Scanner scanner = new Scanner(System.in);
	while(true)
	{

	System.out.println("==========================================================");	
	System.out.println("==========================================================");
	System.out.println(" 1- Generate bill by entering product code and quantity\n 2- Exit");
	System.out.println("==========================================================");
	System.out.println("choose option");
	System.out.println("==========================================================");
	int n= scanner.nextInt();
	switch(n)
	{
	case 1:
	{
		System.out.println("                    enter product details");
		System.out.println("                    ===========================");
		System.out.println("enter id");
		
		  prodId = scanner.nextInt();
		  System.out.println("==========================================================");
		while(true)
		{
			
		if(Integer.toString(prodId).length()!=4)
		{
	System.out.println("product id is not right re - enter product id");
	System.out.println("enter id");
	  prodId = scanner.nextInt();
		}
		else
		{
		 p =serviceObj.getProductDetail(prodId);
			if(p!=null)
			{
				System.out.println(p);
				System.out.println("==========================================================");
				
			}
			break;
		}
		}
		System.out.println("\n");
		System.out.println("enter Enter the quantity");
		
		prodQuant = scanner.nextInt();
		System.out.println("==========================================================");
		while(true)
		{
			
		if(prodQuant<=0)
		{
	System.out.println("product Quantity is not right re - enter product quantity");
	prodQuant = scanner.nextInt();
		}
		else
		{
			System.out.printf("%25s %25s", "Product name :", p.getProductName().toString());
			
			System.out.println("\n");
			
		System.out.printf("%25s %25s", "product Category :", p.getProductcateg().toString());
			System.out.println("\n");
			if(p.getProductId()==1001) {
			System.out.printf("%25s %25s","Product Description :", "smart phone");}
			else if(p.getProductId()==1002) {
				System.out.printf("%25s %25s","Product Description : ", "smart tv");}
			else if(p.getProductId()==1003) {
				System.out.printf("%25s %25s", "Product Description :", "children toy");}
			else if(p.getProductId()==1001) {
				System.out.printf("%25s %25s","Product Description :", "Scientific toy");}
			System.out.println("\n");
			System.out.printf("%25s %25s","Quantity :", Integer.toString(prodQuant));
			System.out.println("\n");
			System.out.println("==========================================================");
			
			
			System.out.printf("%25s %25s","line Total (rs)",Integer.toString(prodQuant*p.getProductprice()));
			break;
		}
		}
		
		
		
	}
	case 2:
	{
		System.exit(0);
	}
	
	}
	
	
	
}
}
}
