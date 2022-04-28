package com.demo.oops;

public class AbstractionWithEncapsulation {
	public static void main(String[] args) {
		Account1 account = null;
//		account = new SavingsAccount1();
//		account.getAccountInfo();
//		account = new DigitalWalletAccount1();
//		account.getAccountInfo();
		
		if(Math.random() > .5)
		{
			account = new SavingsAccount1();
		}
		else {
			account = new DigitalWalletAccount1();
		}
		account.getAccountInfo();
	}
}

// abstract classes Education, Transportation
abstract class Account1 {
	// abstract method has no body
	public abstract void getAccountInfo();
}

class SavingsAccount1 extends Account1 {
	// write only
	private int pin;

	// mutator
	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public void getAccountInfo() {
		System.out.println("Indian Bank Savings Account!");
	}

}

class DigitalWalletAccount1 extends Account1 {

	@Override
	public void getAccountInfo() {
		System.out.println("Google Payment Gateway account!");
	}

}