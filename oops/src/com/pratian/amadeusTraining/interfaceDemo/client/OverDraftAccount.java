package com.pratian.amadeusTraining.interfaceDemo.client;



 class OverDraftAccount extends AccountType {
private double odlimit;
	public OverDraftAccount(String accNo, double balance, String dateOfOpening) {
		super(accNo, balance, dateOfOpening);
		
		this.odlimit=500000;
		minBalance=0;
	}
	@Override
public double withdraw(double amount)
{if(amount<getBalance())
	{setBalance(getBalance()-amount);
	}
else if(amount<(getBalance()+odlimit))
	{setBalance(0);
		odlimit=getBalance()+odlimit-amount;}

	else
		System.out.println("Exhausted");
return getBalance();
}
	public double getOdlimit() {
		return odlimit;
	}
	public void setOdlimit(double odlimit) {
		this.odlimit = odlimit;
	}
	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Succesfully opened OD account");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Succesfully Closed OD account");
	}

}
