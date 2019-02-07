package com.capgemini.mobilePurchaseProject.service;
import java.time.LocalDate;

import  com.capgemini.mobilePurchaseProject.exception.PurchaseException;
import java.util.Scanner;
import com.capgemini.mobilePurchaseProject.bean.purchaseDetail;
import com.capgemini.mobilePurchaseProject.repo.RepositoryPurchase;
import com.capgemini.mobilePurchaseProject.bean.Coustomer;
import com.capgemini.mobilePurchaseProject.bean.MobileDetail;

public class Logic implements ILogic {
static int purchaseId=0;
	@Override
	public void purchase() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter coustomer name ");
		String name = scanner.nextLine();
		System.out.println(" enter mail id");
		String mailId = scanner.nextLine();
		System.out.println("enter phone number ");
		long pNumber= scanner.nextLong();
		System.out.println(" mobile id");
		int mobileIdObj = scanner.nextInt();
		purchaseId= purchaseId+1;
		
	  purchaseDetail purchaseDetailObj= new purchaseDetail(new Coustomer(name,mailId,pNumber),mobileIdObj, LocalDate.now());
	  PurchaseException expObj =new PurchaseException();
	  expObj.exception();
	  RepositoryPurchase repoPurchaseObj = new RepositoryPurchase(purchaseId, purchaseDetailObj);
		
	}

	@Override
	public void showAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long mobileId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(MobileDetail mobile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search(int range1, int range2) {
		// TODO Auto-generated method stub
		
	}

}