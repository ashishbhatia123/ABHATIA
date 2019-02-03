package group3question;

import java.util.Scanner;

public class DuplicateChar {
	public static void main(String args[])
	{
	 String s="";
	Scanner sc= new Scanner(System.in);
	System.out.println("enter strings");
	String str= "abcdefghijklmnopqrstuvwxyz";
	char arr[]= str.toCharArray();
	String str1= sc.nextLine();
	char arr1[]= str1.toCharArray();

	for(int i=0;i<str1.length();i++)
	{
	if(arr[(int)arr1[i]-97]!='#')
	{
	s=s+Character.toString(arr1[i]);
	arr[(int)arr1[i]-97]='#';
	
	}

	}
	System.out.println("new string  "+ s);
	}

}
