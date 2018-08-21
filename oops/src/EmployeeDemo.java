
public class EmployeeDemo {

	public static void main(String[] args) {
		EmployeeData empData= new EmployeeData();
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		empData.storeData(emp1);
		empData.showData(emp1);
		
		empData.storeData(emp2);
		empData.showData(emp2);
	}

}
