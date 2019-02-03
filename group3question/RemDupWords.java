package group3question;

import java.util.*;

public class RemDupWords {
public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
System.out.println("enter string");
String str =sc.nextLine();
String arr[]= str.split(" ");
Set<String> hash_set = new HashSet<String>();
for(int i=0 ;i<arr.length; i++)
{
	hash_set.add(arr[i]);
}
int j=0;
String arr1[]= new String[arr.length];
Set<String> hash_set2 = new HashSet<String>();
for(int i=0 ;i<arr.length; i++)
{
	if(hash_set.contains(arr[i])) {
		arr1[j]=arr[i];
		j++;
		hash_set2.add(arr[i]);
		
		hash_set.removeAll(hash_set2);
	}
}
for(int i=0 ;i<arr1.length && arr1[i]!=null; i++)
{
	System.out.print(arr1[i]+" ");
}
}
}

