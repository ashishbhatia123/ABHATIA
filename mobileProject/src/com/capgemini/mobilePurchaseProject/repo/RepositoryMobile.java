package com.capgemini.mobilePurchaseProject.repo;

import com.capgemini.mobilePurchaseProject.bean.purchaseDetail;

public class RepositoryMobile {
	long mobileID;
	purchaseDetail purchaseDetailObj;
	public RepositoryMobile(long mobileID, purchaseDetail purchaseDetailObj) {
		super();
		this.mobileID = mobileID;
		this.purchaseDetailObj = purchaseDetailObj;
	}
	

}
