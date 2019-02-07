package com.capgemini.mobilePurchaseProject.repo;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.mobilePurchaseProject.bean.MobileDetail;
import com.capgemini.mobilePurchaseProject.bean.purchaseDetail;

public class RepositoryMobile {
	int mobileId;
	public Map<Integer, MobileDetail> map = new HashMap<Integer, MobileDetail>();
	
	void insertMobileRecord()
	{
	map.put(100, new MobileDetail(2000,"Nokia",10000));
	map.put(200, new MobileDetail(2000,"Nokia",20000));
	map.put(300, new MobileDetail(2000,"Nokia",30000));
	map.put(400, new MobileDetail(2000,"Nokia",40000));
	map.put(500, new MobileDetail(2000,"Nokia",50000));
	map.put(600, new MobileDetail(2000,"Nokia",60000));
	map.put(700, new MobileDetail(2000,"Nokia",70000));

}
}

