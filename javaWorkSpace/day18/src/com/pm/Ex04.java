package com.pm;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex04 {
	public static void main(String[] args) {
		String msg = "hello world";
		
		OutputStream os = null;
		
		// contains an internal buffer that contains bytes that may be read from the stream. 
		//An internal counter keeps track of the next byte to be supplied by the read method. 
		//
		ByteArrayInputStream bais = null;
		//implements an output stream in which the data is written into a byte array. 
		//The buffer automatically grows as data is written to it.
		ByteArrayOutputStream baos =null;
		
		try {
			baos = new ByteArrayOutputStream();
			baos.write(msg.getBytes());
			byte[] arr = baos.toByteArray();
			bais = new ByteArrayInputStream(arr);
			while(true) {
				int su = bais.read();
				if(su==-1) break;
				System.out.print((char)su);
			}
			
			baos.close();
			bais.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}
}
