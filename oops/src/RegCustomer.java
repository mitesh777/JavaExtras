

public class RegCustomer extends Customer {
private double disc;

public double getDisc() {
	return disc;
}

public void setDisc(double disc) {
	this.disc = disc;
}

public RegCustomer(int id, String name, double disc) {
	super(id, name);
	this.disc = disc;
}
public double totalOrder() {
double total=super.totalOrder();

total-=total*getDisc();
	return total;
}
}

