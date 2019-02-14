package ashishbhatia;

import java.time.LocalDate;
import java.util.Scanner;

class warranty
{
	void m1() {
		LocalDate now = LocalDate.now();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of month");
		int month = sc.nextInt();
		System.out.println("enter number of years");
		int years= sc.nextInt();
		now=now.plusMonths(month).plusYears(years);
		//now=now.plusYears(years);
		System.out.println(now);
		
	}
}
public class Ques3e {
public static void main(String[] args) {
	warranty obj= new warranty();
	obj.m1();
}
}
