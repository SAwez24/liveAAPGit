package com.demo.java8;

import java.io.File;
import java.io.FileFilter;

public class LambdaExpressionEx {
// a+b / expressions
// () -> {} / lambda expressions
// String name = "velocity"; // string variable
// FunctionalInterface object = () - {} // functional interface variable
	public static void main(String[] args) {
		// Directory file
		File directoryFile = new File(
				"C:\\Users\\Enzo\\Desktop\\Amaze\\liveAAPGit\\java\\ld-java-master\\src\\com\\demo\\assorted");
		// functional interface
//		FileFilter lambdaFileFilter = (File file) -> {
//			String fileName = file.getName();
//			boolean endsWith = fileName.endsWith(".java");
//			return endsWith;
//		};

		FileFilter lambdaJavaFileFilter = (File file) -> {
			return file.getName().endsWith(".java");
		};

		// files ending with java
		File[] javaFilesInsideDirectory = directoryFile.listFiles(lambdaJavaFileFilter);
		for (File file : javaFilesInsideDirectory) {
			System.err.println(file.getName());
		}
//
//		FileFilter lambdaTextFileFilter = (File file) -> {
//			return file.getName().endsWith(".txt");
//		};
//		File[] textFilesInsideDirectory = directoryFile.listFiles(lambdaTextFileFilter);
//		// files ending with java
//		for (File file : textFilesInsideDirectory) {
//			System.err.println(file.getName());
//		}
	}

}

//class FileFilterTest implements FileFilter {
//
//	@Override
//	public boolean accept(File file) {
//		String fileName = file.getName();
//		boolean endsWith = fileName.endsWith(".java");
//		return endsWith;
//	}
//	
//}