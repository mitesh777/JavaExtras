
public class squares {

	public static void main(String[] args) {
		int N=0;
		System.out.println("Enter the last number");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		N = scanner.nextInt();
		for(int i=2;i*i<=N;i=i+2)
			System.out.print(" " + i*i);

	}

}
