
public class OrderedItem {
private int quantity;
private Item item;
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public Item getItem() {
	return item;
}
public void setItem(Item item) {
	this.item = item;
}
public OrderedItem(int quantity, Item item) {
	super();
	this.quantity = quantity;
	this.item = item;
}

}
