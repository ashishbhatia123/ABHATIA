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


===========================================================================================
for faster execution use BufferReader and printWriter

Import java.io.*;
 
public static void main(String[] args) throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int N = Integer.parseInt(br.readLine().trim());   	// by default it takes as string
 String  []inp = br.readLine().split(" ");  		 // taking spaces input 
br.close()



============================================================================================

Import java.io.*;
PrintWriter wr = new PrintWriter(System.out);
wr.println();

wr.close();

