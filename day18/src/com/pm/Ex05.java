package com.pm;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Ex05 {
	public static void main(String[] args) {
		File file = new File("data05.txt");
		
		OutputStream os = null;
		PrintStream ps =null;
		try {  
			file.createNewFile();
			os = new FileOutputStream(file);
			ps = new PrintStream(os);
			
			ps.write('A');
			ps.println(1234);
			ps.println(3.14);
			ps.println("hello world");
			ps.println("hello world");
			ps.println("hello world");
			
			ps.write(97);  //a
			ps.println(97); //97
			
			ps.close();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
