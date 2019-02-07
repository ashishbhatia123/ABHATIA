package com.capgemini.mobilePurchaseProject.bean;
import java.time.LocalDate;
import com.capgemini.mobilePurchaseProject.bean.Coustomer;

public class purchaseDetail {
private Coustomer cous_detail;
private LocalDate  date;
private long mobileId;
public purchaseDetail(Coustomer cous_detail,  long mobileId, LocalDate date) {
	super();
	this.cous_detail = cous_detail;
	this.mobileId = mobileId;
	this.date = date;
}

public Coustomer getcour_detail() {
	return cous_detail;
}
public void setDetail(Coustomer cous_detail) {
	this.cous_detail = cous_detail;
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
	return "purchaseDetail [cous_detail=" + cous_detail +  ", mobileId=" + mobileId + "]";
}





}