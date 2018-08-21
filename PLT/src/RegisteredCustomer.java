
public class RegisteredCustomer extends Customer{
private double fees;
	
	public RegisteredCustomer(int id, String name, String datOfbirth, String gender, double fees) {
		super(id, name, datOfbirth, gender);
		this.fees = fees;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}
	public void display() {
		super.display();
		System.out.println("FEES:" +fees);
	}
}
