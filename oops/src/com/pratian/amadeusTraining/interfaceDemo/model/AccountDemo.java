package com.pratian.amadeusTraining.interfaceDemo.model;

import com.pratian.amadeusTraining.interfaceDemo.client.*;

public class AccountDemo {

	public static void main(String[] args) {
	Account acc1=AccountFactory.create("1234",2000,"Savings");
	Account acc2=AccountFactory.create("876",1000,"Corporate");
	Account acc3=AccountFactory.create("876",1000,"OverDraft");
	System.out.println("Balance after deposit :" +acc2.deposit(50000));
	System.out.println("Current Balance:" +acc1.withdraw(1000));
	System.out.println("Current Balance:" +acc3.withdraw(52000));
	}

}
