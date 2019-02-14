package com.cg.pro1.bean;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProgram {
	public static void main(String[] args) {
		
		CopyDataThread s=null;
     try {
		 s=new CopyDataThread(new FileReader("C:\\Users\\BRAJMISH\\Documents\\Brajesh Mishra\\input.txt"),new FileWriter("C:\\Users\\BRAJMISH\\Documents\\Brajesh Mishra\\output.txt"));
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