



package com.capgemini.junit.testing;
import java.util.Scanner;
class nameException extends Exception
{
	String fname;
	String lname;
	public nameException(String fname, String lname) {
		super("hi hello");
		this.fname = fname;
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "nameException [fname=" + fname + ", lname=" + lname + "]";
	}
	
	
}


public class userException {
private String fname;
private String lname;



public userException(String fname, String lname) {
	this.fname= fname;
	this.lname= lname;
	// TODO Auto-generated constructor stub
}

public String method()throws nameException
{if(fname.equals("")&& lname.equals(""))
{
	throw new nameException("name is not correct","lname is not correct"  );
}
else
{
	return ("full name is correct");
}
}
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter name");
	String str= sc.nextLine();
	String str2 = sc.nextLine();
	userException obj= new userException(str,str2);
	
	
	try{
	obj.method();
	}
	catch ( nameException e)
	{
		System.out.println(e);
		System.out.println(e.getMessage());
	}
	
	

}

}

