
public class tax2 {

	public static void main(String[] args) {
		int empId=0,basic=0;
		double sp=0.0,perc=0.0,saving=0.0,month=0.0,annual=0.0,gross=0.0,a=0.05,b=0.2,c=0.3,s1=250000,s2=500000,s3=1000000,actual=0.0,net=0.0,taxpay=0.0;
		String name="";
		System.out.println("Enter Name");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		name = scanner.next();
		System.out.println("Enter EmployID");
		empId = scanner.nextInt();
		System.out.println("Enter basic");
		basic = scanner.nextInt();
		System.out.println("Enter special allowance");
		sp = scanner.nextDouble();
		System.out.println("Enter bonus percentage");
		perc = scanner.nextDouble();
		System.out.println("Enter tax saving investment");
		saving = scanner.nextDouble();
		month=basic+sp;
		annual=month*12;
		gross=annual+perc*(basic*12);
		System.out.println("monthly" + month);
		System.out.println("annual salary" + annual);
		System.out.println("gross salary" + gross);
		actual=gross;	
		if(saving<=150000)
		
		gross=gross-saving;
		else
			gross=gross-150000;
		if(gross>=s3)
			taxpay=a*s1+b*s2+c*(gross-s3);
		else if(gross>=s2 && gross<=s3)
			taxpay=a*s1+b*(gross-s2);
		else if(gross>=s1 && gross<=s2)
			taxpay=a*(gross-s1);
		
		net=actual - taxpay;
		System.out.println("tax payable" + taxpay);
		System.out.println("net salary" + net);
	}

}
