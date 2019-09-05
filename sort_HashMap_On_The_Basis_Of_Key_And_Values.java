package ashishbhatia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class asd {
	static int  index;
	public static void main(String[] args) {
		
	
	Map<String,Integer> map = new HashMap<String, Integer>();
	map.put("a",1);
	map.put("d",4);
	map.put("b",2);
	map.put("c",3);
	map.put("ab",0);
	map.put("ca",-1);
	
	System.out.println(map);
	
	List<String> keyList = new ArrayList<String>();
	List<Integer> valueList = new ArrayList<Integer>();
	for(String key : map.keySet())
	{
		int value = map.get(key);
		valueList.add(value);
		keyList.add(key);
		
	}
	
	
	// sort on the basis of values 
	
	for(int i=0;i< keyList.size()-1;i++)
	{
		index =i;
		int min = valueList.get(i);
		for(int j=i+1;j< keyList.size();j++)
		{
			if(min>valueList.get(j))
			{
				min= valueList.get(j);
				index=j;
			}
		}
		
		valueList.set(index, valueList.get(i));
		valueList.set(i, min);
		String min2= keyList.get(index);
		keyList.set(index, keyList.get(i));
		keyList.set(i, min2);
		
	}
	
	
	Map< String,Integer> map2 = new LinkedHashMap<String,Integer>();
	
	for(int i=0;i< keyList.size();i++)
	{
		map2.put(keyList.get(i), valueList.get(i));
	}
	
	
	System.out.println(map2  +"  "+ " sort on the basis of values");


	// sort on the basis of keys 
	
		for(int i=0;i< keyList.size()-1;i++)
		{
			index =i;
			String min = keyList.get(i);
			for(int j=i+1;j< keyList.size();j++)
			{
				if(min.compareTo(keyList.get(j))>0)
				{
					min= keyList.get(j);
					index=j;
				}
			}
			
			keyList.set(index, keyList.get(i));
			keyList.set(i, min);
			int min2= valueList.get(index);
			valueList.set(index, valueList.get(i));
			valueList.set(i, min2);
			
		}
		
		Map< String,Integer> map3 = new LinkedHashMap<String,Integer>();
		
		for(int i=0;i< keyList.size();i++)
		{
			map3.put(keyList.get(i), valueList.get(i));
		}
		
		
		System.out.println(map3  +"  "+ " sort on the basis of keys"  );
	
	
	}
}
