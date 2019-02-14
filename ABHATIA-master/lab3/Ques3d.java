package ashishbhatia;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

class AcceptDate2{
	

	void m1(){
		

		
		
	System.out.println("enter dates");
	Scanner sc= new Scanner(System.in);
	System.out.println("enter year");
	int years=sc.nextInt();
	System.out.println("enter month");
	int month =sc.nextInt();
	System.out.println("enter date");
	int date= sc.nextInt();
	LocalDate dates1 =LocalDate.of(years,month,date);
		
		System.out.println("enter dates");
		
		System.out.println("enter year");
		years=sc.nextInt();
		System.out.println("enter month");
		 month =sc.nextInt();
		System.out.println("enter date");
		 date= sc.nextInt();
		LocalDate dates2 =LocalDate.of(years,month,date);
			
		//LocalDate dates =LocalDate.of(years,month,date);
	Period gap =Period.between(dates1, dates2);
	System.out.println(gap);
}
}
public class Ques3d {
	public static void main(String[] args) {
		AcceptDate2 obj= new AcceptDate2();
		obj.m1();
		
	}
}
