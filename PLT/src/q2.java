
public class q2 {

	public static void main(String[] args) {
		int num=0;
		System.out.println("Enter the last number");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		num = scanner.nextInt();
		for(int i=-1;Math.abs(i)<=num;i--)
			if(i%2==0)
				System.out.print(" " + Math.abs(i));
			else
				System.out.print(" " + i);
	}}