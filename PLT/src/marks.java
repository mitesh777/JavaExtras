
public class marks {

	public static void main(String[] args) {
		int mark1=0,mark2=0,mark3=0,total;
		String name="";
		double avg=0.0;
		System.out.println("Enter Student Name");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		name = scanner.next();
		System.out.println("Enter Mark1");
		mark1 = scanner.nextInt();
		System.out.println("Enter Mark2");
		mark2 = scanner.nextInt();
		System.out.println("Enter Mark3");
		mark3 = scanner.nextInt();
total=mark1 + mark2 + mark3;
avg=total/3;
System.out.println("Student Name:" + name);
System.out.println("Total:" + total);
System.out.println("Average:" + avg);
if(mark1<35 || mark2<35 || mark3<35)
	System.out.println("FAIL");
else
	{if(avg>60)
		System.out.println("1st");
	else if (avg>50) {
		System.out.println("2nd");
	}
	else  {
		System.out.println("PASS");
	}
}}}
