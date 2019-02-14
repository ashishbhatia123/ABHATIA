package com.cg.Lab8.bean;
import java.io.*;

public class Lab8_1 {
	 
		public static void main(String[] args) {
			
			CopyDataThread s=null;
	     try {
			 s=new CopyDataThread(new FileReader("D:\\Practice\\SpringWebServices\\txt1.txt"),new FileWriter("D:\\Practice\\SpringWebServices\\txt2.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     s.start();
	}
	}

