package com.pratian.amadeusTraining.interfaceDemo.client;



 class CorporateAccount extends AccountType {

	public CorporateAccount(String accNo, double balance, String dateOfOpening) {
		super(accNo, balance, dateOfOpening);
		minBalance=0;
	
	}

	@Override
	public void open() {
		System.out.println("Succesfully opened Corporate account");

	}

	@Override
	public void close() {
		System.out.println("Succesfully Closed Corporate account");

	}

}
