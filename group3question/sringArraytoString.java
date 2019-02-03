package group3question;

class A{
    String arr[];
   public  String s="";
    A(String arr[])
    {
       this.arr= arr; 
    }
    
    public String toString()
    {
     for(int i=0;i<arr.length;i++)
     {
         s=s+arr[i]+" ";
     }
     return(s);
    }
}

public class sringArraytoString {
	public static void main(String[] args) {
		String[] strArr = new String[] {"1","2","3"};
		
		A str = new A(strArr);
		
		System.out.println("Java String array to String = "+str);
	}

}
