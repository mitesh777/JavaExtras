
public class BankDemo {

	public static void main(String[] args) {
		int choice;
		Customer c=new Customer(1, null);
		Account a=new Account();
		int custId = 0;
		CustomerManager custManager=new CustomerManager();
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		do {
		System.out.println("1.Add Account");
		System.out.println("2.Add Customer");
		System.out.println("3.show details");
		System.out.println("4.Exit");
		System.out.println("Enter Your Choice");
		choice=scanner.nextInt();
		switch(choice)
		{
		case 1:{addAccount(custManager,custId,a);
				
				custId=scanner.nextInt();
				a.setAccountNo(11021);
				a.setType("REGULAR");
				a.setDate("10/11/2018");
				a.setBalance(1100);
		}
				break;
		case 2:addCustomer(custManager,c);
				break;
		case 3:printDetails(custManager);
				break;
		case 4:System.exit(0);
		default:System.out.println("Bad Choice");
		}
		}while(choice>=1 && choice<=4);
			
	}

	private static void printDetails(CustomerManager custManager) {
		custManager.compreData();
		
	}

	private static void addCustomer(CustomerManager custManager,Customer c) {
		
		custManager.addCustomer(c);
		
	}

	private static void addAccount(CustomerManager custManager,int custId,Account a) {
		
		custManager.openAccount(a, custId);
		
	}

	

}
