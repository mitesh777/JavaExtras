
public class EmployeeData {
void showData(Employee emp)
{System.out.println("\nEmployee Id:" + emp.getEmpId());
System.out.println("\nEmployee Name:" + emp.getName());
System.out.println("Address" +emp.getAdd().getAddressLine1());
System.out.print("\n" +emp.getAdd().getAddressLine2());
System.out.print("\n" +emp.getAdd().getCity());
System.out.print("\n" +emp.getAdd().getPinCode());
	}
void storeData(Employee emp)
{java.util.Scanner scanner=new java.util.Scanner(System.in);

Address add1=new Address();
System.out.print("\nEnter the Name");
String name=scanner.next();
System.out.println("\nEnter employ ID");
int empId=scanner.nextInt();
System.out.println("Enter Address");

add1.setAddressLine1(scanner.nextLine());
add1.setAddressLine2(scanner.nextLine());
add1.setCity(scanner.nextLine());
add1.setPinCode(scanner.nextLine());

emp.setEmpId(empId);
emp.setName(name);
emp.setAdd(add1);
	}
}
