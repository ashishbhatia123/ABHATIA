package com.capgemini.takehome.exception;

public class IdNotMatchException extends Exception {
	public IdNotMatchException(int productCode)
	{
		System.out.println(" Sorry ! the product code <<"+ productCode+ ">> is not available");
	}

}
