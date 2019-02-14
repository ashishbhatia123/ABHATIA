package com.cg.Lab9.ui;
import java.io.*;
import java.util.*;
public class Lab9_2 {
	
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			FileReader input=null;
	     try {
			input=new FileReader("D:\\\\Practice\\\\SpringWebServices\\\\number.txt");
			Scanner scanner =new Scanner(input);
			while(scanner.hasNext())
			{String str=scanner.nextLine();
			String string[]=str.split(",");
			for(String s:string)
			{int i=Integer.parseInt(s);
			if(i%2==0)
				System.out.print(i+" ");
			}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	}

