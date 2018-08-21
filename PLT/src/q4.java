
public class q4 {

	public static void main(String[] args) {
		int i=1,j=4,k=7,num=0,ser=0;
		System.out.println("Enter the last number");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		num = scanner.nextInt();
		System.out.print("" + i);
		System.out.print(" " + j);
		System.out.print(" " + k);
while(ser!=num)
	{
	ser=i+j+k;
	i=j;
	j=k;
	k=ser;
	System.out.print(" " + ser);}
}

}
