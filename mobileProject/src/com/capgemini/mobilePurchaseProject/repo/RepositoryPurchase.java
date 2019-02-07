package com.capgemini.mobilePurchaseProject.repo;

import com.capgemini.mobilePurchaseProject.bean.purchaseDetail;

public class RepositoryPurchase {
	int purchaseId;
	purchaseDetail purchaseDetailObj;
	public RepositoryPurchase(int purchaseId, purchaseDetail purchaseDetailObj) {
		super();
		this.purchaseId = purchaseId;
		this.purchaseDetailObj = purchaseDetailObj;
	}
	

}
