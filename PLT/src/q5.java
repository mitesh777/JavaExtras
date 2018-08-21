
public class q5 {

	public static void main(String[] args) {
		int N=0;
		System.out.println("Enter the last number");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		N = scanner.nextInt();
		for(int i=1;i*i<=N;i++)
			if(i%4!=0)
			System.out.print(" " + i*i);


	}

}
