package ashishbhatia;

import java.util.Scanner;

 class Ques3a {

	private static final String NULL = null;
	public static String str1;
	 Ques3a(String str)
	{ 
		 str1= str;
	}
	public void add() {
		System.out.println("enter string1");
		Scanner sc = new Scanner(System.in);
		
		String str2= sc.nextLine();
		str1= str1+str2;
		System.out.println("new string "+str1);
					}
	
		public void repOdd()
		{
			char arr[]= str1.toCharArray();
			for(int i=0;i<str1.length();i++)
			{
				if(i%2==0)
				{
					arr[i]='#';
				}
			}
			String str= new String(arr);
			System.out.println("new string will be " +str);
		}
		public void remDup()
		{
			String str2="";
			String str= "abcdefghijklmnopqrstuvwxyz";
			char arr[]= str.toCharArray();
			char arr1[]= str1.toCharArray();
			for(int i=0;i< str1.length();i++)
			{
				if(arr[(int)arr1[i]-97]!='#')
				{
					str2=str2+ Character.toString(arr1[i]);
					arr[(int)arr1[i]-97]='#';
					
				}
			}
			System.out.println("new string will be"+ str2);
		}
		public void oddToUppercase()
		{
			char arr[]= str1.toCharArray();
			for(int i=0;i<str1.length();i++)
			{
				if(i%2==0)
				{
				String s=	Character.toString(arr[i]);
				s= s.toUpperCase();
				arr[i]=s.charAt(0);
				
				}
			}
			String str3= new String(arr);
			System.out.println("new string will be "+ str3);
		}
	

}

class Main
{
public static void main(String[] args) 
{
		System.out.println("enter the string");
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine();
		Ques3a obj= new Ques3a(str); 
		
		System.out.println("enter your choice");
		System.out.println("1- add string to itself \n 2- replace odd position with # \n 3 - remove duplicate character in the string \n 4 - change odd character to upper case ");
			int i= sc.nextInt();
			
				if(i==1)
				{
					obj.add();
				}
				else if(i==2)
				{
					obj.repOdd();
				}
				else if(i==3)
				{
					obj.remDup();
				}
				else if(i==4)
				{
					obj.oddToUppercase();
				}
			
	}
}

