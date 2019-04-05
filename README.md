# ABHATIA
capgemini lab manual 

retrieve value from map

for(Integer key :hm1.keySet())
		{
			String keys = key.toString();
			String value = hm1.get(key).toString();
			System.out.println(keys +"  "+ value);
		}





for(Entry<String, String> entry : facilities.entrySet()) {
    String key = entry.getKey();
    String value = entry.getValue();
    System.out.println(key + " " + value);
}
