
public class largest {

	public static void main(String[] args) {
	int a=0,b=0,c=0,large=0,sec=0;
	System.out.println("Enter the numbers");
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	a = scanner.nextInt();
	b = scanner.nextInt();
	c = scanner.nextInt();
	if(a>b)
	{	large=a;
		sec=b;
	}
	else
	{	large=b;
	sec=a;
}
	if(c>large)
	{	sec=large;
		large=c;
		
	}
	else if (c>sec) {
		sec=c;
	}
	System.out.println("Largest" + large);
	System.out.println("Second" + sec);
	}

}
