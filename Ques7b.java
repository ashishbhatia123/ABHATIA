package ashishbhatia;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class A{
	String result="";
	String method1(String s1, String s2) {
		char arr1[]= s1.toCharArray();
		
		for(int i=0;i<arr1.length;i++)
		{
			if(i%2==0 && i!=arr1.length-1)
			{
				result=result+arr1[i]+ s2;	
			}
			else if(i%2==0 && i==arr1.length-1)
			{
				result=result+arr1[i];
			}
		}
		return(result);
	}
	String method2(String s1, String s2)
	{
		char arr1[]= s1.toCharArray();
		char arr2[]= s2.toCharArray();
		int len2= s2.length()-1;
		int temp=s2.length();
		if(s1.indexOf(s2)!=s1.lastIndexOf(s2))
		{
			int lastIndex=s1.lastIndexOf(s2);
			while(temp--!=0)
			arr1[lastIndex++]=arr2[len2--];
			
			return(new String(arr1));
		}
		else 
			return(s1+s2);
		
	}
	String method3(String s1, String s2)
	{
		if(s1.indexOf(s2)!=s1.lastIndexOf(s2))
		{
			String str=s1.replaceFirst(s2, "");
			return(str);
			
		}
		else 
			return("1111"+s1);
	}
	String method4(String s1, String s2)
	{
		if(s2.length()%2==0)
		{
			return(s2.substring(0, (s2.length())/2)+s1+s2.substring((s2.length()/2), s2.length()));
		}
		else
			
			return(s2.substring(0, ((s2.length())/2)+1)+s1+s2.substring((s2.length()/2)+1, s2.length()));
		}
	String method5(String s1, String s2)
	{
		String str=s1;
		char arr2[]=s2.toCharArray();
		for(int i=0;i<s2.length();i++)
		{
			String str2=Character.toString(arr2[i]);
			str=str.replaceAll(str2, "*");
		}
		return str;
	}
	
	/*String method2(String s1, String s2)
	{
			char arr1[]= s1.toCharArray();
			char arr2[]= s2.toCharArray();
			int p=0;
			int temp=s2.length();
			int counter=0;
			int repCounter=0;
			int index=0;
			int r=temp-1;
			for(int i=0;i<s1.length()-s2.length()+1;i++)
			{
				while(temp--!=0) {
				if(arr1[i+s2.length()-temp-1]==arr2[p++%s2.length()])
				{
					counter++;
					if(counter==s2.length())
						index=i;
				}
			}
				
				if(counter == s2.length())
				{
					repCounter++;
				}
				counter=0;
				temp=s2.length();
		
	
}
			System.out.println("vbnvn"+index);
			System.out.println(repCounter);
			
	
	if(repCounter>1)
	{
	int j=(int)Math.pow(2, repCounter)-1;
	System.out.println(j);
	
	while(temp--!=0)
	{
		arr1[index++]=arr2[r--];
	}
	s1= new String(arr1);

	return(s1);
	}
	else
		return( s1+s2);

	}*/
	
}
public class Ques7b {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String s1= "capgemini";
	String s2="pg";
	System.out.println("s1="+s1 +"s2="+s2  );
	List<String> list = new ArrayList<String>();
	A obj= new A();
	String str=obj.method1(s1,s2);
	System.out.println("s1="+str +"s2="+s2  );
	list.add(str);
	String str2=obj.method2(str,s2);
	list.add(str2);
	System.out.println("----s1="+str2 +"s2="+s2  );
	
	String str3=obj.method3(str2,s2);
	list.add(str2);
	System.out.println("----s1="+str3 +"s2="+s2  );
	
	String str4=obj.method4(str3,s2);
	list.add(str4);
	System.out.println("----s1="+str4 +"s2="+s2  );
	
	String str5=obj.method5(str4,s2);
	list.add(str5);
	System.out.println("----s1="+str5
			+"s2="+s2  );
}
}














/*char arr1[]= s1.toCharArray();
char arr2[]=s2.toCharArray();
int l2= s2.length();
int temp=l2;
int counter=0;
int repCount=0;
int p=0;
for(int i=0;i<s1.length();i++)
{
	int q=i;
	System.out.println(temp);
	while(temp--!=0)
	{if((int)arr1[q++]==(int)arr2[(p++)%s2.length()])
	{
		counter++;
		System.out.println("11m"+counter +"   " +temp);
	}
	}
	System.out.println("11mm"+counter);
	if(counter==l2)
		repCount++;
	
	
	counter=0;
	temp=l2;
	
}  
System.out.println(repCount);
if(repCount>1)
{
int j=(int)Math.pow(2, repCount)-1;
for(int i=j;i<j+s2.length();i++)
	arr1[i]=arr2[s2.length()-i-j-1];
s1= new String(arr1);

return(s1);
}
else
	return( s1+s2);

}
*/