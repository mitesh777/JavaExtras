
public class odd {

	public static void main(String[] args) {
		int N=0,sum=0;
		System.out.println("Enter number upto which sum is to be calculated");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		N = scanner.nextInt();
		for(int i=1;i<=N;i++)
		{if(i%2!=0)
			sum = sum + i;
	}
		System.out.println("SUM:" + sum);
		}

}
