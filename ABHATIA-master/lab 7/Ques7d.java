package ashishbhatia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Squares{
	Map<Integer,Double> getSquares(List<Integer> list)
	{
		Map<Integer, Double> map =new HashMap<Integer, Double>();
		for(Integer key : list)
		{
		map.put(key, Math.pow(key, 2));
		}
		System.out.println(map.keySet());
		return map;
	}
}
public class Ques7d {
public static void main(String[] args) {
List<Integer> list = new ArrayList<Integer>();
list.add(1);
list.add(2);
list.add(3);
	
Squares obj = new Squares();
Map<Integer, Double> map=obj.getSquares(list);
for(Integer keys : map.keySet())
{
	String key = keys.toString();
String value = map.get(keys).toString();
System.out.println(key + "  :  " + value);
}
}
}