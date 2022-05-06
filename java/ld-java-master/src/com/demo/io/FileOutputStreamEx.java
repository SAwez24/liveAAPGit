package com.demo.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutputStreamEx {
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
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write(stringInBytes);
			fileOutputStream.flush();
			fileOutputStream.close();
		} catch (FileNotFoundException e) {
			System.err.println("The File cannot be found...");
		} catch (IOException e) {
			System.err.println("Cannot write data...");
		}
	}
}
