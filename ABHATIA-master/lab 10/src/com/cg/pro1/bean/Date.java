package com.cg.pro1.bean;

class Date{
	int Day, Month, Year;
// Constructor
	Date(int Day, int Month, int Year) {
	this.Day = Day;
	this.Month = Month;
	this.Year = Year;
	}
	// setter and getter methods
	void setDay(int intDay){
		this.Day = intDay;
	}
	int getDay( ){
		return this.Day;
	}
	void setMonth(int intMonth){
		this.Month = intMonth;
	}
	int getMonth(){
		return this.Month;
	}
	void setYear(int intYear){
		this.Year=intYear;
	}
	int getYear(){
		return this.Year;
	}
	public String toString() //converts date obj to string.
	{
		return "Date is "+Day+"/"+Month+"/"+Year;
	}
} // Date class