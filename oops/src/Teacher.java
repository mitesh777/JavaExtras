
public class Teacher {
private PersonalDetails personalDetails;
private double salary;
public PersonalDetails getPersonalDetails() {
	return personalDetails;
}
public void setPersonalDetails(PersonalDetails personalDetails) {
	this.personalDetails = personalDetails;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Teacher(PersonalDetails personalDetails, double salary) {
	super();
	this.personalDetails = personalDetails;
	this.salary = salary;
}
public Teacher(double salary) {
	super();
	this.salary = salary;
}

}
