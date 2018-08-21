package com.pratian.amadeusTraining.interfaceDemo.client;


 class SavingsAccount extends AccountType {

	@Override
	public void open() {
		System.out.println("Succesfully opened SAVINGS account");

	}

	@Override
	public void close() {
		System.out.println("Succesfully Closed Savings account");

	}

	public SavingsAccount(String accNo, double balance, String dateOfOpening) {
		super(accNo, balance, dateOfOpening);
	minBalance=5000;
	}

}
