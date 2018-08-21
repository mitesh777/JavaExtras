
public class prime {

	public static void main(String[] args) {
		int n=0,m=0,sum=0;
		boolean flag=false;
		System.out.println("Enter the range of numbers");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		for(int i=n;i<=m;i++)
		{flag=false;
			for(int j=2;j<=Math.sqrt(i);j++)
				if(i%j==0)
					flag=true;
		if(flag==false)
			{System.out.print(" " + i);
			sum+=i;
			
			}}
		System.out.println(" Sum:" + sum);}

}
