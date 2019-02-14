package ashishbhatia;
import java.util.Scanner;


public class Ques3g {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter userName");
		String str= sc.nextLine();
		char arr[]=str.toCharArray();
		int i=str.length()-1;
		
			if(arr[i]=='b'&&arr[i-1]=='o'&&arr[i-2]=='j'&&arr[i-3]=='_'&&(i+1-8>0) )
			{
				System.out.println("true");
			}
			else
			{System.out.println("false");
			}
			}
		
		}

