package group3question;

import java.util.*;


public class anagram {
public static void main(String[] args) {
	

Scanner sc= new Scanner(System.in);
System.out.println("enter strings");
	String s1=sc.nextLine();
String s2=sc.nextLine();
char arr1[]= s1.toCharArray();
char arr2[]= s2.toCharArray();
Arrays.sort(arr1);
Arrays.sort(arr2);
s1= new String(arr1);
s2=new String(arr2);
if(s1.equals(s2))
{
	System.out.println("Anagram");
}
else
{
	System.out.println("not anagram");
}
}
}