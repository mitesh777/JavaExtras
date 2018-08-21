
public class reverse {

	public static void main(String[] args) {
		int num=0,dig=0,rev=0;
		System.out.println("Enter the number");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		num = scanner.nextInt();
		
		do
		{
			dig=num%10;
			num=num/10;
			rev=rev*10 + dig;
		
		}while(num!=0);
		System.out.println("reverse:" + rev);
	}

}
