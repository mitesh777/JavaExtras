
public class SchoolDemo {

	public static void main(String[] args) {
		int choice;
		School school=new School();
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		do {
		System.out.println("1.Add Student");
		System.out.println("2.Add Teacher");
		System.out.println("3.Calculate Profit");
		System.out.println("4.Exit");
		System.out.println("Enter Your Choice");
		choice=scanner.nextInt();
		switch(choice)
		{
		case 1:addStudent(school);
				break;
		case 2:addTeacher(school);
				break;
		case 3:	viewProfitOrLoss(school);
				break;
		case 4:System.exit(0);
		default:System.out.println("Bad Choice");
		}
		}while(choice>=1 && choice<=4);
			
	}

	private static void viewProfitOrLoss(School school) {
		double profit =school.calculateMonthlyProfit();
		System.out.println(profit>0 ? "Profit" + profit : "Loss" + profit);
		
	}

	private static void addTeacher(School school) {
		Teacher t = new Teacher(20000);
		school.addTeacher(t);
		
	}

	private static void addStudent(School school) {
		Student s = new Student(50000);
		school.addStudent(s);
		
	}

}
