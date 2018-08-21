
public class q3 {

	public static void main(String[] args) {
		int num=0;
		System.out.println("Enter the last number");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		num = scanner.nextInt();
		for(int i=1;Math.pow(i, i)<=num;i++)
			System.out.print(" " +(int) Math.pow(i, i));

	}

}
