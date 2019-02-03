package group3question;
import java.util.Scanner;
public class weight {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter string");
		String str= sc.nextLine();
	char arr[]= str.toCharArray();
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		sum = sum+(int)arr[i]-96;
		
	}
	System.out.println("sum is "+ sum);
}
}
