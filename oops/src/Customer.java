import java.util.ArrayList;

public class Customer {
private int id;
private String name;
private ArrayList<Order> Orders=new ArrayList<Order>();
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public ArrayList<Order> getOrders() {
	return Orders;
}
public void setOrders(ArrayList<Order> orders) {
	Orders = orders;
}
public Customer(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public void addOrder(Order o)
{Orders.add(o);
	}
public double totalOrder() {
double total=0.0;
for(Order o:Orders)
total+=o.totalItem();
	return total;}
}
