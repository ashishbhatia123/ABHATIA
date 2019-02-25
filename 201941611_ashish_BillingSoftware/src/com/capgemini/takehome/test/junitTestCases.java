package com.capgemini.takehome.test;

import static org.junit.Assert.*;



import org.junit.Test;

import com.capgemini.takehome.exception.IdNotMatchException;
import com.capgemini.takehome.service.IProductService;
import com.capgemini.takehome.service.ProductService;

public class junitTestCases {

	@Test
	public void test() {
		IProductService serviceObj = new ProductService();
		
		int prodId= 1001;
		int prodQuant =2;
		int result =serviceObj.getProductDetail(prodId).getProductprice() * prodQuant;
		assertEquals(70000,result);
	}

	
	@Test
	public void test2() throws IdNotMatchException {
		IProductService serviceObj = new ProductService();
//		System.out.println((serviceObj.getProductDetail(1005)));
	
		serviceObj.getProductDetail(1005);

		
		//assertNull(serviceObj.getProductDetail(1005));
	}
}