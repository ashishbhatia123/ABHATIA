package ashishbhatia;

import java.util.ArrayList;
import java.util.List;

class RemoveList
{
	List<String> list1;
	List<String> list2;
	RemoveList(List<String> list1, List<String> list2)
	{
		this.list1=list1;
		this.list2=list2;
	}
	void methodRemoveList() {
		System.out.println(list1);
		System.out.println(list2);
		list1.removeAll(list2);
		System.out.println(list1);
		list1.removeAll(list1);
		System.out.println(list1);
	}
}
public class Ques7c {
	public static void main(String[] args) {
		
	
List<String> list1 = new ArrayList<String>();
List<String> list2 = new ArrayList<String>();
list1.add("one");
list1.add("two");
list1.add("three");
list1.add("four");
list1.add("five");
list1.add("six");
list2.add("six");
list2.add("seven");
list2.add("two");

RemoveList obj = new RemoveList(list1,list2);
obj.methodRemoveList();
}
}
