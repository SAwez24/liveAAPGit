package com.demo.oops;

public class AbstractionWithAbstractClassEx {
public static void main(String[] args) {
	Account account = null;
	account = new SavingsAccount();
	account.getAccountInfo();
	account = new DigitalWalletAccount();
	account.getAccountInfo();
}
}

// abstract classes Education, Transportation
abstract class Account {
	// abstract method has no body
	public abstract void getAccountInfo();
}

class SavingsAccount extends Account{

	@Override
	public void getAccountInfo() {
	System.out.println("Indian Bank Savings Account!");
	}
	
}

class DigitalWalletAccount extends Account{

	@Override
	public void getAccountInfo() {
	System.out.println("Google Payment Gateway account!");
	}
	
}