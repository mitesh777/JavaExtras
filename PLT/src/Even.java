
public class Even {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		num = scanner.nextInt();
		if(num % 2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
			
	}

}
