package com.cg.eis.pl;
import java.util.Scanner;
import com.cg.cis.bean.*;
import com.cig.eis.service.*;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter details");
	 Service obj1 = new Service();
	obj1.setEmployeeDetails(new Employee(1,"Ashish",250000,"programmer","abhee likhnaa haii "));
	Employee obj2= obj1.getEmployeeDetails();
	System.out.println(obj2);
}
}
