package com.pratian.amadeusTraining.interfaceDemo.client;

public class AccountFactory {
public static  Account create(String AccNo,double balance,String accountType)
{if(accountType.equals("Savings"))
	return new SavingsAccount(AccNo,balance,"10-7-2018");
else if(accountType.equals("OverDraft"))
	return new OverDraftAccount(AccNo,balance,"10-7-2018");
else 
	return new CorporateAccount(AccNo,balance,"10-7-2018");
	
}
}
