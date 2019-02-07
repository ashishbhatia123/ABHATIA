package com.capgemini.mobilePurchaseProject.service;

import com.capgemini.mobilePurchaseProject.bean.MobileDetail;

public interface Ilogic {
public void purchase();
public void showAll();
public void delete(long mobileId);
public void add(MobileDetail mobile);
public void search(int range1, int range2);
}
