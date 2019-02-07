package com.capgemini.mobilePurchaseProject.bean;
import java.time.LocalDate;

public class purchaseDetail {
private Coustomer cour_detail;
private LocalDate  date;
private long mobileId;
public purchaseDetail(Coustomer Cour_detail,  long mobileId, LocalDate date) {
	super();
	this.cour_detail = cour_detail;
	this.mobileId = mobileId;
	this.date = date;
}
public Coustomer getcour_detail() {
	return cour_detail;
}
public void setDetail(Coustomer cour_detail) {
	this.cour_detail = cour_detail;
}


public long getMobileId() {
	return mobileId;
}
public void setMobileId(long mobileId) {
	this.mobileId = mobileId;
}

public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
@Override
public String toString() {
	return "purchaseDetail [cour_detail=" + cour_detail +  ", mobileId=" + mobileId + "]";
}





}
