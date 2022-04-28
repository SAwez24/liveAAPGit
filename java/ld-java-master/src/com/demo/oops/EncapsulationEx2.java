package com.demo.oops;

class CreditCard {
	// encapsulated fields
	private long creditCardNo = 1234123412349876L;
	// read only
	private String cardHolderName = "Jim";
	// write only
	private int pin;
	// read / write with restrictions
	private int age;

	public String getCardHolderName() {
		return cardHolderName;
	}

	public String getCreditCardNo() {
		return "XXXXXXXXXXXX9876";
	}

	public int getAge() {
		if (age > 50) {
			System.err.println("young");
			return 1;
		}
		System.err.println("wise");
		return 2;
	}

	public void setAge(int age) {
		if (age < 18) {
			System.err.println("Children cannot hold cards!");
			return;
		}
		if (age > 61) {
			System.err.println("Too wise to hold cards!");
			return;
		}
		this.age = age;
	}

	// mutator
	public void setPin(int pin) {
		this.pin = pin;
	}
}

public class EncapsulationEx2 {
	public static void main(String[] args) {
		CreditCard creditCard = new CreditCard();
//		System.out.println(creditCard.cardHolderName);
//		The field CreditCard.creditCardNo is not visible
//		System.out.println("mail to : " + creditCard.creditCardNo);
		System.err.println("mail to : " + creditCard.getCreditCardNo());
		creditCard.setPin(1234);

	}
}

