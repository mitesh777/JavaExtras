
public class Customer {
private int id;
private String name;
private String datOfbirth;
private String gender;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDatOfbirth() {
	return datOfbirth;
}
public void setDatOfbirth(String datOfbirth) {
	this.datOfbirth = datOfbirth;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Customer(int id, String name, String datOfbirth, String gender) {
	super();
	this.id = id;
	this.name = name;
	this.datOfbirth = datOfbirth;
	this.gender = gender;
}
public void display() {
	System.out.println("ID:" +id);
	System.out.println("Name:" +name);
	System.out.println("gender:" +gender);
	System.out.println("DOB:" +datOfbirth);
}
}
