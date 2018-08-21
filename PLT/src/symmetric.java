
public class symmetric {

	public static void main(String[] args) {
		int[][] a;
		int size=3;
		boolean flag=false;
		a = new int[size][size];
		System.out.print("Enter size of array ");
	
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		size=scanner.nextInt();
		System.out.print("Enter elements of array ");
		for(int j=0;j<size;j++)
			for(int k=0;k<size;k++)
			a[j][k]=scanner.nextInt();
		for(int j=0;j<size;j++)
			{
			for(int k=0;k<size;k++)
				System.out.print(a[j][k]+" ");
			System.out.println();
		}
		for(int j=0;j<size;j++)
		{
		for(int k=0;k<size;k++)
			if(a[k][j]!=a[j][k])
				flag=true;
		}
	if(flag==false)
		System.out.println("Symmetric matrix");
	else 
		System.out.println("Not a Symmetric matrix");
	
	System.out.println("Transpose matrix");
	for(int j=0;j<size;j++)
	{
	for(int k=0;k<size;k++)
		System.out.print(a[k][j]+" ");
	System.out.println();}
}
}
