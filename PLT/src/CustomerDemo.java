
public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1=new Customer(1,"Anoop","20/11/1996","male");
		Customer c2=new Customer(2,"Akash","20/11/1996","male");
		RegisteredCustomer c=new RegisteredCustomer(2,"Akash","5-12-2002","male",10000);
		c1.display();
		c2.display();
		c.display();

	}

}
