package group3question;


import java.util.Scanner;


public class longestOccurringCharacter {
	static int temp=1;
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter string");
	String str = sc.nextLine();
	char arr[]= str.toCharArray();
	
	int arr2[]= new int[26];
	for(int i=0;i<26;i++)
	{
		arr2[i]=0;
	}
	char c= arr[0];

	for(int i=1;i<arr.length;i++)
	{
		while(i<arr.length&&c==arr[i])
		{
			temp++;
			i++;
		}
		
		if(arr2[(int)c-97]<temp)
		{
			arr2[(int)c-97]=temp;
			temp=1;
		}
		if(i<arr.length)
		{
			c=arr[i];
			
		}
		
	}
	
	for(int i=0;i<26;i++ )
	{
		System.out.print((char)(i+97)+ " "+ arr2[i]+" ");
	}
	}

}
