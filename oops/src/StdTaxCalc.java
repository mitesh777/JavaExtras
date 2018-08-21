
public class StdTaxCalc {

private double ist;
private double fed;

public double getIst() {
	return ist;
}
public void setIst(double ist) {
	this.ist = ist;
}
public double getFed() {
	return fed;
}
public void setFed(double fed) {
	this.fed = fed;
}
public StdTaxCalc() {
	super();
	this.ist = 10;
	this.fed = 0.15;
}

}
