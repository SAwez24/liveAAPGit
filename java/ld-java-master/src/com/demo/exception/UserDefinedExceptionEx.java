package com.demo.exception;

public class UserDefinedExceptionEx {
	public static void main(String[] args) {

		try {
			int age = 100;
//			age = 50;
			if (age > 20 && age < 61)
				System.err.println("Valid");
			else {
//				AgeNotValidException ageNotValidException = new AgeNotValidException("Invalid emp age");
				AgeNotValidException ageNotValidException = new AgeNotValidException();
				throw ageNotValidException;
			}

		} catch (AgeNotValidException exception) {
			System.out.println(exception.getMessage());
		}

	}
}

// user-defined Exception
class AgeNotValidException extends RuntimeException {
	public AgeNotValidException() {
		System.err.println("default cons");
	}

	public AgeNotValidException(String message) {
//		public RuntimeException(String message)
		super(message);
	}


}