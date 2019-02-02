package ashishbhatia;
import java.util.Random;
	class Account
	{
		long accNum;
		double balance;
		Person accHoldder;
		Account(long accNum, double balance ,Person accHolder)
		{
			this.accNum=accNum;
			this.balance= balance;
			this.accHolder=accHolder;
		}
		Account(){
			
		}
		
		void  deposit(double amount)
		{
			this.balance= this.balance+amount;
		}
		void   withdraw(double amount)
		{ 
			if(this.balance-amount>500)
			{
				this.balance=this.balance-amount;
			}
			else
				System.out.println("withdrawl is not possible");
		
			
		}
		
				public long getAccNum() {
					return accNum;
				}
				public void setAccNum(long accNum) {
					this.accNum = accNum;
				}
			
			public Person getAccHolder() {
			return accHolder;
			}
			public void setAccHolder(Person accHolder) {				
				this.accHolder = accHolder;
			}
				
				public double getBalance() {
				return balance;
				}
				public void setBalance(double balance) {
					this.balance = balance;
					}

				@Override
				public String toString() {
					return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
				}
			
		
	}
class Person
	{
		String name;
		float age;
		public Person(String name, float age){
			this.name=name;
			this.age=age;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public float getAge() {
			return age;
		}
		public void setAge(float age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}

		
		
	}
	public class Ques4a {
		public static void main(String[] args) {
			 Random rand = new Random(); 
			Person p1,p2;
			p1=new Person("smith",18.0f);
			p2=new Person("kathy",20.0f);
			int x = rand.nextInt(10000)+1;
			int y = rand.nextInt(10000)+1;
		
		Account a1= new Account((long)x,(double)2000,p1);
		Account a2= new Account((long)y,(double)3000,p2);
			System.out.println(a1);
			System.out.println(a2);
			a1.deposit((double)2000);
			a2.withdraw((double)2000);
			System.out.println(a1);
			System.out.println(a2);
		}
}