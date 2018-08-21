
public class Sale {
private int qty;
private double disc;
private SaleItem saleItem;

public Sale(SaleItem saleItem,int qty,double disc) {
	super();
	this.qty = qty;
	this.disc = disc;
	this.saleItem = saleItem;
}
public Sale() {
	super();
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public double getDisc() {
	return disc;
}
public void setDisc(double disc) {
	this.disc = disc;
}
public SaleItem getItem()
{return saleItem;
	}
}
