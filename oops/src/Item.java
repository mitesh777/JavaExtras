
public class Item {
private String description;
private double rate;
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getRate() {
	return rate;
}
public void setRate(double rate) {
	this.rate = rate;
}
public Item(String description, double rate) {
	super();
	this.description = description;
	this.rate = rate;
}

}
