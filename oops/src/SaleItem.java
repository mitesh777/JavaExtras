
public class SaleItem {
private double rate;
private String des;
public double getRate() {
	return rate;
}
public void setRate(double rate) {
	this.rate = rate;
}
public String getDes() {
	return des;
}
public void setDes(String des) {
	this.des = des;
}
public SaleItem() {
	super();
	
}
public SaleItem( String des,double rate) {
	super();
	this.rate = rate;
	this.des = des;
}

}
