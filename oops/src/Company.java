import java.util.ArrayList;

public class Company {
private ArrayList<Customer> c=new ArrayList<Customer>();

public ArrayList<Customer> getC() {
	return c;
}
public void addCustomer(Customer cust) {
	c.add(cust);
}
public double getTotalWorthOfOrdersPlaced() {
	{
		double total=0.0;
		for(Customer cust:c)
		{
			total+=cust.totalOrder();
		}
		return total;
	}

}

}

