package com.capgemini.mobilePurchaseProject.service;

import java.util.Scanner;

import com.capgemini.mobilePurchaseProject.bean.MobileDetail;

public class Logic implements Ilogic {

	@Override
	public void purchase() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter coustomer name ");
		String str1 = scanner.nextLine();
		System.out.println(" enter mail id");
		String str2 = scanner.nextLine();
		System.out.println("enter phone number ");
		Long long3= scanner.nextLong();
		System.out.println(" mobile id");
		Long long4 = scanner.nextLong();
		
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
