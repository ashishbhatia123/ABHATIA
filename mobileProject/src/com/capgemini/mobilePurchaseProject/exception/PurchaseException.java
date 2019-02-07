package com.capgemini.mobilePurchaseProject.exception;

import com.capgemini.mobilePurchaseProject.bean.purchaseDetail;
import com.capgemini.mobilePurchaseProject.repo.*;
class availabilityException extends Exception
{
	availabilityException(String s)
	{
		super(s);
	}
}
public class PurchaseException {
public void exception(purchaseDetail purchaseDetailObj) throws availabilityException {

	RepositoryMobile mobileDataObj = new RepositoryMobile();
	try {
	if(!(mobileDataObj.map.containsKey(purchaseDetailObj.getMobileId())))
	{
		throw new availabilityException("mobile id that you entered does not exist in a database");
	}
	else if(mobileDataObj.map.g)
	{
		
	}
	}
	catch(availabilityException e)
	{
		System.out.println(e.getMessage());
	}
	
}
}
