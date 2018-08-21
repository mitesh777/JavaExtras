
public class CustomerManager {
private Customer[] customers=new Customer[5];
private int custNum;
public void addCustomer(Customer customer)
{
	customers[custNum]=customer;
	custNum++;
	}
public void openAccount(Account a,int custId)
{
	for(int i=0;i<custNum;i++)
		if(custId==customers[i].getId())
			customers[i].addAccount(a);
			
	}
public void generateCustomerData()
{for(int i=0;i<custNum;i++)
	{System.out.println("Customer Id " + customers[i].getId());
System.out.println("Customer DOB " + customers[i].getDob());
System.out.println("Customer name " + customers[i].getName());}
	}
public void compreData()
{for(int i=0;i<custNum;i++)
	{System.out.println("Customer Id " + customers[i].getId());
System.out.println("Customer DOB " + customers[i].getDob());
System.out.println("Customer name " + customers[i].getName());
for(int j=0;j<customers[i].getAccountNum();j++)
{
	System.out.println("Account No." +customers[i].getAccount()[j].getAccountNo());
	System.out.println("Type " +customers[i].getAccount()[j].getType());
	System.out.println("Date " +customers[i].getAccount()[j].getDate());
	System.out.println("Balance " +customers[i].getAccount()[j].getBalance());
	
	}
	}
	}

}

