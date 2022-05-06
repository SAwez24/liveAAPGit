package com.demo.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileInputStreamEx {
	public static void main(String[] args) {
	//	 input : file
	//   output : file
// FileInputStream / FileOutputStream
		// create file
		File file = new File("message.txt");
//		generate data
		String messageString = "James Gosling is the founder of Java \r\nJava is amazing!!!";
//		string > bytearray
		byte[] stringInBytes = messageString.getBytes();
		// file output stream
//		Unhandled exception type FileNotFoundException / Checked Exception
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			int byteVal = fileInputStream.read();
//			-1 is end of file
			while(byteVal !=-1) {
				char charVal = (char)byteVal;
				System.err.print(charVal);
				byteVal = fileInputStream.read();
			}
//			The method flush() is undefined for the type FileInputStream
//			fileInputStream.flush();
			fileInputStream.close();
		} catch (FileNotFoundException e) {
			System.err.println("The File cannot be found...");
		} catch (IOException e) {
			System.err.println("Cannot read data...");
		}
	}
}
