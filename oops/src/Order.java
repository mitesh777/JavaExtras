import java.util.ArrayList;

public class Order {
private String orderDate;
private ArrayList<OrderedItem> orderedItems = new ArrayList<OrderedItem>();
private Customer customer;
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public String getOrderDate() {
	return orderDate;
}
public void setOrderDate(String orderDate) {
	this.orderDate = orderDate;
}
public ArrayList<OrderedItem> getOrderedItems() {
	return orderedItems;
}
public void setOrderedItems(ArrayList<OrderedItem> orderedItems) {
	this.orderedItems = orderedItems;
}
public Order(String orderDate) {
	super();
	this.orderDate = orderDate;

}   
public void addOrderedItem(OrderedItem oi)
{orderedItems.add(oi);
	}
public double totalItem() {
	double total=0;
	for(OrderedItem oi:orderedItems)
	total+=oi.getQuantity()*oi.getItem().getRate();
	return total;
}
}
