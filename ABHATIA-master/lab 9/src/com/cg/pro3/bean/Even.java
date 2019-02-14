package com.cg.pro3.bean;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader input=null;
     try {
		input=new FileReader("C:\\Users\\BRAJMISH\\Documents\\Brajesh Mishra\\inp.txt");
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