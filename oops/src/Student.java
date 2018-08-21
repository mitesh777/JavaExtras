
public class Student {
private PersonalDetails personalDetails;
private double fees;
public Student(PersonalDetails personalDetails, double fees) {
	super();
	this.personalDetails = personalDetails;
	this.fees = fees;
}
public PersonalDetails getPersonalDetails() {
	return personalDetails;
}
public void setPersonalDetails(PersonalDetails personalDetails) {
	this.personalDetails = personalDetails;
}
public double getFees() {
	return fees;
}
public void setFees(double fees) {
	this.fees = fees;
}
public Student(double fees) {
	super();
	this.fees = fees;
}

}
