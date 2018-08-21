
public class triangle {

	public static void main(String[] args) {
		int num=0,count=1;
		System.out.println("Enter the number of rows");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		num = scanner.nextInt();
		while(count<=num)
		
			{for(int j=num-count;j>=0;j--)
				System.out.print(" ");
				
			for(int i=0;i<(2*count-1);i++)
		System.out.print("*");
			System.out.println();
		count++;
	}
	}
}
