package group3question;

import java.util.Scanner;

public class StringStartS {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str= sc.nextLine();
	String sarr[]= str.split(" ");
	String s="";
	for(int i=0;i<sarr.length;i++)
	{
		if(sarr[i].charAt(0)=='s')
		{
			s=s+sarr[i]+" ";
		}
	}
	
}
}
