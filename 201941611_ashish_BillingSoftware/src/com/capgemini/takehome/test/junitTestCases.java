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

	
	/*@Test(expected = IdNotMatchException.class)
	public void test2() throws IdNotMatchException {
		IProductService serviceObj = new ProductService();
assertEquals(null ,serviceObj.getProductDetail(1005));
	}*/
}