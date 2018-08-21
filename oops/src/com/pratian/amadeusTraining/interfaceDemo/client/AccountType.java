package com.pratian.amadeusTraining.interfaceDemo.client;

public abstract class AccountType implements Account{
private String AccNo;
private double balance;
private String dateOfOpening;
protected double minBalance;

public String getAccNo() {
	return AccNo;
}

public AccountType(String accNo, double balance, String dateOfOpening) {
	super();
	AccNo = accNo;
	this.balance = balance;
	this.dateOfOpening = dateOfOpening;
}

public void setAccNo(String accNo) {
	AccNo = accNo;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public String getDateOfOpening() {
	return dateOfOpening;
}

public void setDateOfOpening(String dateOfOpening) {
	this.dateOfOpening = dateOfOpening;
}

public double getMinBalance() {
	return minBalance;
}

public void setMinBalance(double minBalance) {
	this.minBalance = minBalance;
}

public double withdraw(double amount) {
	if(amount<balance)
		balance-=amount;
	else 
		System.out.println("Insufficient Funds");
	return balance;
}
public double deposit(double amount) {
	balance+=amount;
	return balance;
}

}
