package ashishbhatia;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;



class Sorted
{
	int[] getSorted(int a[])
	{
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i< a.length;i++)
		{
			String s= Integer.toString(a[i]);
			StringBuffer sb= new StringBuffer(s);
			sb=sb.reverse();
			s = new String(sb);
			list.add(Integer.parseInt(s));
	
		}
		Collections.sort(list);
		for(int i=0;i<a.length;i++)
		{
			a[i]=list.get(i);
		
		}
		return (a);
	}
}
public class Ques7a {
	public static void main(String[] args) {
		
	
	List<Integer> list = new ArrayList<Integer>();
	Scanner scanner = new Scanner(System.in);
		System.out.println("---------------------------");
		System.out.println("no. of elements you want to insert");
	int n= scanner.nextInt();
	Integer p;
		System.out.println("---------------------------");
		System.out.println("enter numbers");
	for(int i=0;i<n;i++)
		{
			p=scanner.nextInt();
			list.add(p);
		}
	System.out.println("---------------------------");
	int arr2[]= new int[n];
	for(int i=0;i<n;i++)
	{
		arr2[i]=list.get(i);
	}
	
	
	Sorted obj2 = new Sorted();
	
	int arr[]=obj2.getSorted(arr2);
	for(int i=0;i<arr.length;i++)
	{
		list.set(i, arr[i]);
	}
	
	for(Integer i : list)
	{
		System.out.println(i);
	}
}
}