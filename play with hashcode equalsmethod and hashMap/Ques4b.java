package ashishbhatia;

import java.util.HashMap;
import java.util.Map;

class D
{
	

int a;
String b;

public D(int a, String b) {
	super();
	this.a = a;
	this.b = b;
}
}
class C
{
	

int a;
String b;

public C(int a, String b) {
	super();
	this.a = a;
	this.b = b;
}
}

class A
{
	

int a;
String b;
 Map<A,Integer> map = new HashMap<>();
public A(int a, String b) {
	super();
	this.a = a;
	this.b = b;
}

public A() {
	
}


@Override
public int hashCode() {
	System.out.println("A hashode");
	final int prime = 31;
	int result = 1;
	result = prime * result + a;
	result = prime * result + ((b == null) ? 0 : b.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	
	if (getClass() == obj.getClass())
		return false;
	B other = (B) obj;
	System.out.println(other.c);
	if (a != other.c)
		return false;
	if (b == null) {
		if (other.b != null)
			return false;
	} else if (!b.equals(other.d))
		return false;
	return true;
}

@Override
public String toString() {
	return "A [a=" + a + ", b=" + b + "]";
}


}
class B extends A
{
	int c;
	String d;
	
	public B(int c, String d) {
		super();
		this.c = c;
		this.d = d;
	}
	Map<A,Integer> map = new HashMap<>();

	@Override
	public int hashCode() {
		System.out.println("B hashode");
		final int prime = 31;
		int result = 1;
		result = prime * result + c;
		result = prime * result + ((d == null) ? 0 : d.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		if (c != other.a)
			return false;
		if (d == null) {
			if (other.b != null)
				return false;
		} else if (!d.equals(other.b))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "B [c=" + c + ", d=" + d + "]";
	}
	
	
}

public class Ques4b {
	
public static void main(String[] args) {
A obj1 = new A(1,"ashish");
B obj2 = new B(1, "ashish");
C obj3 = new C(1, "ashish");
D obj4 = new D(1, "ashish");
System.out.println(obj1.hashCode());
System.out.println(obj2.hashCode());
System.out.println("bydefault hash code");
System.out.println(obj3.hashCode());
System.out.println(obj4.hashCode());

obj1.map.put(obj1,1);
obj1.map.put( obj2,1);
System.out.println(obj1.equals(obj2));
System.out.println(obj2.equals(obj1));

System.out.println(obj2==(obj1));
System.out.println(obj1.map.keySet());
}
}