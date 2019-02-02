package ashishbhatia;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

class AcceptDate{
	

	void m1(){
	System.out.println("enter dates");
	LocalDate start= LocalDate.now();
	Scanner sc= new Scanner(System.in);
	System.out.println("enter year");
	int years=sc.nextInt();
	System.out.println("enter month");
	int month =sc.nextInt();
	System.out.println("enter date");
	int date= sc.nextInt();
	
	LocalDate end =LocalDate.of(years,month,date);
	Period gap =Period.between(end, start);
	System.out.println(gap);
}
}
public class Ques3c {
	public static void main(String[] args) {
		AcceptDate obj= new AcceptDate();
		obj.m1();
		
	}

}
