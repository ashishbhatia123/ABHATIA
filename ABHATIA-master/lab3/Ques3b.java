package ashishbhatia;

import java.util.Scanner;
class Ques3b {
	public static String str;
	Ques3b(String s)
	{
		str=s;
	}
	public void number() {
	char arr[]= str.toCharArray();
	for( int i=0;i<str.length();i++)
	{
		int arrint= (int)arr[i];
		int j=i-1;
		if(j>0)
		{
			if(arr[j+1]<arr[j])
			{
				System.out.println("Negative string");
				System.exit(0);
			}
			
		}
	}
	System.out.println("Positive number");

}
}
class Main3b{
  public static void main(String[] args)
  {
	  Scanner sc = new Scanner(System.in);
			  System.out.println("enter string");
	  			String s= sc.nextLine();
			  Ques3b obj= new Ques3b(s);
			  obj.number();
  }
}
